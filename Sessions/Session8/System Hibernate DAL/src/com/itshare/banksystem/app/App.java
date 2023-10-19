/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.app;

import com.itshare.banksystem.model.daos.ClientDAOImpl;
import com.itshare.banksystem.model.entities.Client;
import java.util.List;

public class App { 

    private static ClientDAOImpl clientDao = new ClientDAOImpl();

    public static void main(String[] args) {

        Client client = new Client(2, "saed", "khaled", 12);

        Client clientd = clientDao.selectClient(client);
        
        System.out.println(clientd.toString());
                Client clientdd = clientDao.selectClient(client);
        System.out.println(clientdd.toString());

//        List<Client> foundClient=clientDao.selectAllUsingHQL();
//        System.out.println(foundClient.toString());

    }
}
