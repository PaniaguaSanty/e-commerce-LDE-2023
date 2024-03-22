/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
