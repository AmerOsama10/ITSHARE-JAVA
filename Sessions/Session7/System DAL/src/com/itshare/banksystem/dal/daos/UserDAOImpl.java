/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.dal.daos;

import com.itshare.banksystem.dal.model.entities.Client;
import com.itshare.banksystem.dal.model.entities.User;
import com.itshare.banksystem.dal.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author administratorlab
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public int insert(User user) {
        String sqlQuery = "insert into users values (?,?);";

        try {
            // 1.connection
            Connection con = DatabaseUtil.getConnection();

            // 2. statment
            PreparedStatement stat = con.prepareStatement(sqlQuery);
            stat.setString(1, user.getUsername());
            stat.setString(2, user.getPassword());
            // 3. execute query
            int rowsInserted = stat.executeUpdate();

            // 4. get results
            // 5. close connection
            con.close();
            return rowsInserted;

        } catch (SQLException ex) {
            System.out.println("Error when inserting a user");
        }
        return 0;
    }

    @Override
    public int update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<User> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User select(User user) {
        String sqlQuery = "select * from users where username =? and password=? ";

        try {
            // 1.connection
            Connection con = DatabaseUtil.getConnection();

            // 2. statment
            PreparedStatement stat = con.prepareStatement(sqlQuery);
            stat.setString(1, user.getUsername());
            stat.setString(2, user.getPassword());

            // 3. execute query
            ResultSet result = stat.executeQuery();

            User foundUser = null;
            // 4. get results
            while (result.next()) {

                String username = result.getString("username");
                String password = result.getString("password");

                foundUser = new User( username, password);
            }

            // 5. close connection
            con.close();
            return foundUser;
        } catch (SQLException ex) {
            System.out.println("Error when Deleting a client");
        }
        return null;

    }

}
