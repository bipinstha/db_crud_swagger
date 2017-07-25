package com.bipinstha.dbcrud.controller;

import com.bipinstha.dbcrud.model.Person;
import com.bipinstha.dbcrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bshrest2 on 7/25/2017.
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person addPerson(@RequestBody Person person){
        try{
            return this.personService.create(person);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person updatePerson(@RequestBody Person person){
        try{
            return this.personService.update(person);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Person> findAll(){
        try{
            return this.personService.findAll();
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @RequestMapping(value= "/{obj}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable Integer obj){
        try{
            this.personService.delete(obj);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    @RequestMapping(value= "/{obj}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person findOnePerson(@PathVariable Integer obj){
        try{
            return this.personService.findOne(obj);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

}
