package icu.kyakya.orm.mybatis.generator;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.config.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.io.File;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * <pre>
 * @value How-to-use :
 * - https://docs.spring.io/spring-framework/docs/5.2.9.RELEASE/spring-framework-reference/core.html#expressions
 * - https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html#expressions
 * </pre>
 */
@Profile("generator")
@Configuration
@Slf4j
public class GeneratorConfig {

    @Configuration
    @ConfigurationProperties(prefix = "mybatis.generator")
    @Data
    static class Config {
        private String moduleName;
        private String modelTargetPackage;
        private String clientTargetPackage;
        @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
        private Optional<String[]> tables=Optional.empty();


        public String getAbsolutePath(String... dirs) {

            StringJoiner joiner = new StringJoiner(File.separator);

            // get absolute path
            // if multiple module, the root path is the path of root project, not the path of submodule.
            // so we should make submodule path manually.
            String moduleRelativePath = moduleName.replace(".",File.separator);
            String rootAbsolutePath= new File("").getAbsolutePath();
            if (!rootAbsolutePath.contains(moduleRelativePath)){
                joiner.add(rootAbsolutePath).add(moduleRelativePath);
            }

            // absolute path of the target dir
            for (String dir : dirs) {
                joiner.add(dir);
            }

            return joiner.toString();
        }
    }


    @Bean
    public JDBCConnectionConfiguration jdbcConnection(
            @Value("${spring.datasource.url}") String url,
            @Value("${spring.datasource.username}") String username,
            @Value("${spring.datasource.password}") String password,
            @Value("${spring.datasource.driver-class-name}") String driverClassName) {
        log.info("[url]: {} [username]:{} [password]:{} [driver class name]:{}", url, username, password, driverClassName);

        JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setConnectionURL(url);
        jdbcConnectionConfiguration.setUserId(username);
        jdbcConnectionConfiguration.setPassword(password);
        jdbcConnectionConfiguration.setDriverClass(driverClassName);

        // filter out MySql information schemas
        // https://mybatis.org/generator/usage/mysql.html
        jdbcConnectionConfiguration.addProperty("nullCatalogMeansCurrent", "true");

        return jdbcConnectionConfiguration;
    }


    @Bean
    public JavaModelGeneratorConfiguration javaModelGenerator(Config config) {
        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetProject(config.getAbsolutePath("src","main","java"));
        javaModelGeneratorConfiguration.setTargetPackage(config.modelTargetPackage);
        return javaModelGeneratorConfiguration;
    }

    @Bean
    public JavaClientGeneratorConfiguration javaClientGenerator(Config config) {
        JavaClientGeneratorConfiguration javaModelGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetProject(config.getAbsolutePath("src","main","java"));
        javaModelGeneratorConfiguration.setTargetPackage(config.clientTargetPackage);
        javaModelGeneratorConfiguration.setConfigurationType("MIXEDMAPPER");
        return javaModelGeneratorConfiguration;
    }

    @Bean
    public CommentGeneratorConfiguration commentGeneratorConfiguration() {
        CommentGeneratorConfiguration cgc = new CommentGeneratorConfiguration();
        cgc.addProperty("suppressDate","true");
        return cgc;
    }


    @Bean
    Context context(JDBCConnectionConfiguration jdbcConnectionConfiguration
            , JavaModelGeneratorConfiguration javaModelGeneratorConfiguration
            , JavaClientGeneratorConfiguration javaClientGeneratorConfiguration
            , CommentGeneratorConfiguration commentGeneratorConfiguration
            , Config config) {
        Context context = new Context(ModelType.CONDITIONAL);
        context.setId("dsql");
        context.setTargetRuntime("MyBatis3DynamicSql");

        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration);
        setTables(context, config);

        return context;
    }


    private void setTables(Context context, Config config) {
        config.tables.ifPresentOrElse(
                tables -> {
                    for (String table : tables) {
                        TableConfiguration tableCfg = new TableConfiguration(context);
                        tableCfg.setTableName(String.valueOf(table));
                        context.addTableConfiguration(tableCfg);
                    }
                }, () -> {
                    TableConfiguration tableCfg = new TableConfiguration(context);
                    tableCfg.setTableName("%");
                    context.addTableConfiguration(tableCfg);
                });
    }

}
