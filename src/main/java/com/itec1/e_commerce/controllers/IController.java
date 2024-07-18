package com.itec1.e_commerce.controllers;

import java.util.List;

/**
 *
 * @author turraca
 */
public interface IController<E> {

    List<E> updateTable(String string);

    boolean verifyCrud(String selectedOption);

    String create(E entity);

    String update(Long id, E entity);

    E findById(Long id);

    List<E> findAll();

    String disable(Long id);

    String enable(Long id);
}
