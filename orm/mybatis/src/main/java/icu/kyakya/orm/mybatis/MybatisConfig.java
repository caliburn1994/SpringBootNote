package icu.kyakya.orm.mybatis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
        @PropertySource("/mybatis/application.properties"),
        @PropertySource("/mybatis/application-${mybatis.custom.dbType}.properties"),
        @PropertySource("/mybatis/application-${mybatis.custom.appType}.properties"),
})
// 启动CGLIB proxyTargetClass = true
// https://www.baeldung.com/cglib
@EnableAspectJAutoProxy
public class MybatisConfig {

}
