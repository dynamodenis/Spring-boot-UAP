package com.example.SpringBootDemo.api;

import com.example.SpringBootDemo.model.Person;
import com.example.SpringBootDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.insertPerson(person);
    }
}
