package com.bipinstha.dbcrud.service;

import java.util.List;

/**
 * Created by bshrest2 on 7/25/2017.
 */
public interface Abstract<T, PK> {

    public T create(T t);

    public T update(T t);

    public void delete(PK pk);

    public List<T> findAll();

    public T findOne(PK pk);
}
