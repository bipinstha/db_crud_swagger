package com.bipinstha.dbcrud.repository;

import com.bipinstha.dbcrud.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bshrest2 on 7/25/2017.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

}
