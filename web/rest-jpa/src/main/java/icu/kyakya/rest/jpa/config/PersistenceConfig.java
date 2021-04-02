package icu.kyakya.rest.jpa.config;

import icu.kyakya.rest.jpa.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;

import static org.springframework.hateoas.Link.of;

@Configuration
@EnableJpaAuditing
public class PersistenceConfig {


    // https://docs.spring.io/spring-hateoas/docs/current/reference/html/#server.processors


//    @Bean
//    public RepresentationModelProcessor<EntityModel<Person>> personProcessor() {
//
//        return model -> {
//            model.add(of("http://localhost:8080/api/v1/people", "added-link"));
//            return model;
//        };
//    }
}
