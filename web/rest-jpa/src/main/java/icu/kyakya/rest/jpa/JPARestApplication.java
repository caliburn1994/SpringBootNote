package icu.kyakya.rest.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@SpringBootApplication
@Slf4j
public class JPARestApplication {

    public static void main(String[] args) throws IOException {
        // todo this is bug. Append Code generation every time.
        List<org.springframework.core.env.PropertySource<?>> load = new YamlPropertySourceLoader().load("application.yaml", new ClassPathResource("application.yaml"));
        load.get(0).getProperty("");
        File file = new File(load.get(0).getProperty("spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target") + "");
        Files.deleteIfExists(file.toPath());


        SpringApplication.run(JPARestApplication.class, args);
    }



}
