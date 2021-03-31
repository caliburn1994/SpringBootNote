package icu.kyakya.rest.jpa.controller;

import icu.kyakya.rest.jpa.model.Person;
import icu.kyakya.rest.jpa.repository.PersonRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RepositoryRestController
public class PersonController {

//    private final PersonRepository repository;
//
//    public PersonController(PersonRepository repo) {
//        repository = repo;
//    }

    @GetMapping( path = "/test")
    @ResponseBody
    public ResponseEntity<?> getProducers() {
        List<Person> person = new ArrayList<>();
//        repository.findAll().forEach(person::add);
//
//        List<String> firstNames = person.stream().map(Person::getFirstName).collect(Collectors.toList());

//         do some intermediate processing, logging, etc. with the person

//
//        CollectionModel<String> resources = CollectionModel.of(firstNames);

//        resources.add(linkTo(methodOn(ScannerController.class).getProducers()).withSelfRel());

        // add other links as needed

        return ResponseEntity.ok("");
    }

}
