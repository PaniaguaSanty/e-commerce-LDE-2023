package com.itec1.e_commerce.config;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.services.ClientServiceImpl;

public class UploadDB {

    private ClientServiceImpl service;

    public UploadDB() {
        this.service = new ClientServiceImpl();
        service.create(new Client("Kevin","Turraca","Dirección","20424052753","kevin@gmail.com","123456"));
        service.create(new Client("Chano","Perez","Dirección2","12345678910","chano@gmail.com","123456"));
        service.create(new Client("Fulano","De Tal","asdfasdf","10987654321", "fulanito@gmail.com","987654"));
    }
}
