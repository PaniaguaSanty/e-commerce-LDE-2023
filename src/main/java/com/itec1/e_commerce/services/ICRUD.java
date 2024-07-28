package com.itec1.e_commerce.services;

import java.util.List;

/**
 *
 * @author sjcex
 */
public interface ICRUD<T> {

    T create(T entity);

    T update(Long id, T entity) throws Exception;

    T findById(Long id);

    List<T> findAll();

    List<T> findAllEnabled();

    T disable(Long id) throws Exception;

    T delete(Long id) throws Exception;

    T enable(Long id) throws Exception;
}
