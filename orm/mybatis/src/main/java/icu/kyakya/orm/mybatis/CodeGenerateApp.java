package icu.kyakya.orm.mybatis;

import icu.kyakya.orm.mybatis.generator.GeneratorRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.SimpleCommandLinePropertySource;

@SpringBootApplication
public class CodeGenerateApp implements ApplicationRunner {

    GeneratorRunner runner;

    public CodeGenerateApp(GeneratorRunner runner) {
        this.runner = runner;
    }

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(CodeGenerateApp.class);
        SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
        if (!source.containsProperty("spring.profiles.active") &&
                !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {
            app.setAdditionalProfiles("generator");
        }
        app.run();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        runner.run();
    }
}
