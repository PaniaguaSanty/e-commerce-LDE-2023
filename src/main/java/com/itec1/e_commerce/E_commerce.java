/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itec1.e_commerce;

import com.itec1.e_commerce.config.Connection;
import com.itec1.e_commerce.config.UploadDB;
import com.itec1.e_commerce.views.MainFrame;

/**
 *
 * @author sjcex
 */
public class E_commerce {

    public static void main(String[] args) {
        new Connection();
        new UploadDB();
        new MainFrame();
    }
}
