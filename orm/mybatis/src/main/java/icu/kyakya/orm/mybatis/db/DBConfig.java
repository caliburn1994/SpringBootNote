package icu.kyakya.orm.mybatis.db;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DBConfig {

    @Profile({"h2"})
    @Bean(name = "dataSource")
    public static DataSource h2DataSource() {
        log.info("[kyakya] 初始化H2内存数据库");
        return DataSourceBuilder.create()
                .url("jdbc:h2:file:~/h2test.db")
                .username("")
                .password("")
                .build();
    }

}
