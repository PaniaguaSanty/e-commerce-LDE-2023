package com.itec1.e_commerce.config;

import com.itec1.e_commerce.entities.Client;
import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.ClientServiceImpl;
import com.itec1.e_commerce.services.ProviderServiceImpl;

public class UploadDB {

    private final ClientServiceImpl clientService;
    private final ProviderServiceImpl providerService;

    public UploadDB() {
        this.clientService = new ClientServiceImpl();
        this.providerService = new ProviderServiceImpl();
        clientService.create(new Client("Kevin", "Turraca", "Dirección", "20424052753", "kevin@gmail.com", "123456"));
        clientService.create(new Client("Chano", "Perez", "Dirección2", "12345678910", "chano@gmail.com", "123456"));
        clientService.create(new Client("Fulano", "De Tal", "asdfasdf", "10987654321", "fulanito@gmail.com", "987654"));

        providerService.create(new Provider("Santiago", "Paniagua", "Las hortensias 10717", "20458407577", "paniaguasanty10@gmail.com", "3765101858"));
        providerService.create(new Provider("provedor2", "provedor2lastname", "provedor2Dirección", "12345678911", "provedor2gmail.com", "123456"));
        providerService.create(new Provider("provedor3", "provedor3lastname", "provedor3Dirección", "12345678912", "provedor3gmail.com", "123457"));
        providerService.create(new Provider("provedor3", "provedor3lastname", "provedor3Dirección", "12345678913", "provedor3gmail.com", "123458"));
        providerService.create(new Provider("provedor4", "provedor4lastname", "provedor4Dirección", "12345678914", "provedor4gmail.com", "123459"));
    }
}
