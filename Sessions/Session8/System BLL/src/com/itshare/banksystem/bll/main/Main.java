/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.bll.main;

import com.itshare.banksystem.bll.ClientBusinessLogicLayer;
import com.itshare.banksystem.model.entities.Client;

/**
 *
 * @author administratorlab
 */
public class Main {
    
   private static   ClientBusinessLogicLayer business = new ClientBusinessLogicLayer();

    public static void main(String[] args){
        
//        Client client = new Client();
//        client.setId(1);
//        ClientBusinessLogicLayer business = new ClientBusinessLogicLayer();
//        Client foundClient = business.selectClient(client);
//        System.out.println(foundClient.toString());
        
        
            int id = Integer.parseInt("1");

            Client client = new Client();
            client.setId(id);

            System.out.println(client.toString());

            Client clientData = business.selectClient(client);
            System.out.println(clientData.toString());
            
       
      
    }
    
}
