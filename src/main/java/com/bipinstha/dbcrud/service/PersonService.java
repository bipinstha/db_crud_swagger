package com.bipinstha.dbcrud.service;

import com.bipinstha.dbcrud.model.Person;
import com.bipinstha.dbcrud.repository.PersonRepository;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bshrest2 on 7/25/2017.
 */
@Service
public class PersonService implements Abstract<Person, Integer>{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person create(Person person) {
        //TODO include business validation
        if(person.getId() != null)
            throw new IllegalArgumentException("New entity cannot be created with id");
        return this.personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        //TODO include business validation
        if(person.getId() == null)
            throw new IllegalArgumentException("Update entity cannot be done without id");
        return this.personRepository.save(person);
    }

    @Override
    public void delete(Integer obj) {
        if(obj == null){
            throw new IllegalArgumentException("invalid id");
        }
        this.personRepository.deleteById(obj);
    }

    @Override
    public List<Person> findAll() {
        return Lists.newArrayList(this.personRepository.findAll());
    }

    @Override
    public Person findOne(Integer obj) {
        if(obj == null){
            throw new IllegalArgumentException("invalid id");
        }
        return this.personRepository.findById(obj).get();
    }
}
