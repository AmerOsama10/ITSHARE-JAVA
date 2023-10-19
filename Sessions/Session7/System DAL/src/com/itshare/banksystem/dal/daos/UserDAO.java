/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.dal.daos;


import com.itshare.banksystem.dal.model.entities.User;
import java.util.List;

/**
 *
 * @author administratorlab
 */
public interface UserDAO {

    public int insert(User user);

    public int update(User user);

    public int delete(User user);

    public List<User> selectAll();

    public User select(User user);

}
