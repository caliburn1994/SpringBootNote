package icu.kyakya.orm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@MapperScan("icu.kyakya.orm.mybatis.mapper")
@PropertySources({
        @PropertySource("/mybatis/application.properties"),
        @PropertySource("/mybatis/application-${mybatis.custom.dbType}.properties"),
        @PropertySource("/mybatis/application-${mybatis.custom.appType}.properties"),
})
public class MybatisConfig {

}
