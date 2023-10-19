/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.dal.daos;

import com.itshare.banksystem.dal.model.entities.Client;
import com.itshare.banksystem.dal.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administratorlab
 */
public interface ClientDAO {

    public int insert(Client client);

    public int update(Client client);

    public int delete(Client client);

    public List<Client> selectAll();

    public Client select(Client client);
    
    
    

}
