/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.bll;

import com.itshare.banksystem.model.daos.ClientDAO;
import com.itshare.banksystem.model.daos.ClientDAOImpl;
import com.itshare.banksystem.model.entities.Client;
import java.util.List;

/**
 *
 * @author administratorlab
 */
public class ClientBusinessLogicLayer {

    ClientDAO clientDao ;
    
    public ClientBusinessLogicLayer(){
        clientDao = new ClientDAOImpl();
    }

    public int insertClient(Client client) {
       
            int rowsInserted = clientDao.insertClient(client);
            return rowsInserted;
          
    }

    public int updateClient(Client client) {
        int rowsUpdated = clientDao.updateClient(client);
            return rowsUpdated;

    }

    public int deleteClient(Client client) {
        int rowsDeleted = clientDao.deleteClient(client);
            return rowsDeleted;

    }

    public Client selectClient(Client client) {

        Client foundClient = clientDao.selectClient(client);
        return foundClient;

    }

    public List<Client> selectAllClients(Client client) {

        List<Client> clients = clientDao.selectAllClientsUsingHQL();
            return clients;
        
    }

}
