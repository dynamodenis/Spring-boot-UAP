package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.dao.PersonDao;
import com.example.SpringBootDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public  PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    }

    public int insertPerson(Person person){
        return personDao.insertPerson(person);
    }

}
