/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.dal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author administratorlab
 */
public class DatabaseUtil {

    final static String URL = "jdbc:mysql://localhost/Test";
    final static String USER = "root";
    final static String PASS = "root";
       
       
    public static Connection getConnection() {
        Connection con=null;
        try {
            
             con = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            System.out.println("Error in Database Connection");
            con = null;
        }

        return con;
    }

}
