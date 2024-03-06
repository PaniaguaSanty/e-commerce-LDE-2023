package com.itec1.e_commerce.config;

import com.itec1.e_commerce.controllers.ClientPanelController;
import com.itec1.e_commerce.entities.Client;

public class UploadDB {

    private ClientPanelController clientController;

    public UploadDB() {
        clientController.create(new Client("Kevin","Turraca","Dirección","20424052753","kevin@gmail.com","123456"));
        clientController.create(new Client("Chano","Perez","Dirección2","12345678910","chano@gmail.com","123456"));
        clientController.create(new Client("Fulano","De Tal","asdfasdf","10987654321", "fulanito@gmail.com","987654"));
    }
}
