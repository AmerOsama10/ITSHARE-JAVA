/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.dal.daos;

import com.itshare.banksystem.dal.model.entities.Client;
import com.itshare.banksystem.dal.util.DatabaseUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administratorlab
 */
public class ClientDAOImpl implements ClientDAO{

    @Override
    public int insert(Client client) {

        String sqlQuery = "insert into clients values (?,?,?,?);";

        try {
            // 1.connection
            Connection con = DatabaseUtil.getConnection();

            // 2. statment
            PreparedStatement stat = con.prepareStatement(sqlQuery);
            stat.setInt(1, client.getId());
            stat.setString(2, client.getFirstname());
            stat.setString(3, client.getLastname());
            stat.setInt(4, client.getAge());
            // 3. execute query
            int rowsInserted = stat.executeUpdate();

            // 4. get results
            // 5. close connection
            con.close();
            return rowsInserted;

        } catch (SQLException ex) {
            System.out.println("Error when inserting a client");
        }
        return 0;

    }

    @Override
    public int update(Client client) {

        String sqlQuery = "update clients set first_name=? , last_name=? , age =? where id=?;";

        try {
            // 1.connection
            Connection con = DatabaseUtil.getConnection();

            // 2. statment
            PreparedStatement stat = con.prepareStatement(sqlQuery);
            stat.setString(1, client.getFirstname());
            stat.setString(2, client.getLastname());
            stat.setInt(3, client.getAge());
            stat.setInt(4, client.getId());

            // 3. execute query
            int rowsUpdated = stat.executeUpdate();

            // 4. get results
            // 5. close connection
            con.close();
            return rowsUpdated;

        } catch (SQLException ex) {
            System.out.println("Error when updating a client");
        }
        return 0;

    }

    @Override
    public int delete(Client client) {

        String sqlQuery = "delete from clients where id=?;";

        try {
            // 1.connection
            Connection con = DatabaseUtil.getConnection();

            // 2. statment
            PreparedStatement stat = con.prepareStatement(sqlQuery);
            stat.setInt(1, client.getId());

            // 3. execute query
            int rowsDeleted = stat.executeUpdate();

            // 4. get results
            // 5. close connection
            con.close();

            return rowsDeleted;

        } catch (SQLException ex) {
            System.out.println("Error when Deleting a client");
        }
        return 0;

    }

    @Override
    public List<Client> selectAll() {

        String sqlQuery = "select * from clients";

        try {
            // 1.connection
            Connection con = DatabaseUtil.getConnection();

            // 2. statment
            PreparedStatement stat = con.prepareStatement(sqlQuery);

            // 3. execute query
            ResultSet result = stat.executeQuery();
            List<Client> list = new ArrayList<>();
            // 4. get results
            while (result.next()) {
                 int id = result.getInt("id");
                String fname = result.getString("first_name");
                String lname = result.getString("last_name");
                int age = result.getInt("age");

                Client foundClient = new Client(id, fname, lname, age);
                list.add(foundClient);
            }

            // 5. close connection
            con.close();
            return list;

        } catch (SQLException ex) {
            System.out.println("Error when select all clients");
        }
        return null;

    }

    @Override
    public Client select(Client client) {

        String sqlQuery = "select * from clients where id =? ";

        try {
            // 1.connection
            Connection con = DatabaseUtil.getConnection();

            // 2. statment
            PreparedStatement stat = con.prepareStatement(sqlQuery);
            stat.setInt(1, client.getId());
            // 3. execute query
            ResultSet result = stat.executeQuery();

            
             Client foundClient = null ;
            // 4. get results
            while (result.next()) {

                int id = result.getInt("id");
                String fname = result.getString("first_name");
                String lname = result.getString("last_name");
                int age = result.getInt("age");

                foundClient = new Client(id, fname, lname, age);
            }

            // 5. close connection
            con.close();
            return foundClient;
        } catch (SQLException ex) {
            System.out.println("Error when Deleting a client");
        }
        return null;

    }

}
