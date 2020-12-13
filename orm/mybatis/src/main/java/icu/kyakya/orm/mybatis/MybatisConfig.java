package icu.kyakya.orm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("icu.kyakya.orm.mybatis.mapper")
public class MybatisConfig {

}
