/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.model.daos;

import com.itshare.banksystem.model.entities.Client;
import java.util.List;



/**
 *
 * @author administratorlab
 */
public interface ClientDAO {


    public int insertClient(Client client);

    public int updateClient(Client client);

    public int deleteClient(Client client);

    public List<Client> selectAllClientsUsingHQL();

    public Client selectClient(Client client);
    
    
    

}
