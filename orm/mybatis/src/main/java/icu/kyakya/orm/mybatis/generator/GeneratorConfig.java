package icu.kyakya.orm.mybatis.generator;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.config.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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


    @Value("${spring.datasource.url}")
    String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    public JDBCConnectionConfiguration jdbcConnection() {
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


    @Value("${mybatis.generator.modelTargetPackage}")
    private String ModelTargetPackage;

    @Bean
    public JavaModelGeneratorConfiguration javaModelGenerator() {
        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetProject("src/main/java");
        javaModelGeneratorConfiguration.setTargetPackage(ModelTargetPackage);
        return javaModelGeneratorConfiguration;
    }

    @Value("${mybatis.generator.clientTargetPackage}")
    private String ClientTargetPackage;

    @Bean
    public JavaClientGeneratorConfiguration javaClientGenerator() {
        JavaClientGeneratorConfiguration javaModelGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetProject("src/main/java");
        javaModelGeneratorConfiguration.setTargetPackage(ClientTargetPackage);
        javaModelGeneratorConfiguration.setConfigurationType("MIXEDMAPPER");
        return javaModelGeneratorConfiguration;
    }


    @Bean
    Context context(JDBCConnectionConfiguration jdbcConnectionConfiguration
            , JavaModelGeneratorConfiguration javaModelGeneratorConfiguration
            , JavaClientGeneratorConfiguration javaClientGeneratorConfiguration) {
        Context context = new Context(ModelType.CONDITIONAL);
        context.setId("dsql");
        context.setTargetRuntime("MyBatis3DynamicSql");

        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);
        setTables(context);

        return context;
    }


    @Value("${mybatis.generator.tables}")
    private String[] tables;

    private void setTables(Context context) {
        TableConfiguration tableCfg = new TableConfiguration(context);

//        if (ArrayUtils.isEmptytables)
        tableCfg.setTableName("%");
        context.addTableConfiguration(tableCfg);
    }

}
