package icu.kyakya.orm.mybatis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@PropertySources({
        @PropertySource("/mybatis/application.properties"),
        @PropertySource("/mybatis/application-${mybatis.custom.dbType}.properties"),
        @PropertySource("/mybatis/application-${mybatis.custom.appType}.properties"),
})
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {CodeGenerateApp.class})
})
@EnableAspectJAutoProxy // if enable CGLIB, use proxyTargetClass = true
public class MybatisConfig {

}
