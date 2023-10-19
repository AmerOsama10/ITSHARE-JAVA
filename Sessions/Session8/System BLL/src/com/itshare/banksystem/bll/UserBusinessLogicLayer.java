/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.bll;


import com.itshare.banksystem.model.daos.UserDAO;
import com.itshare.banksystem.model.daos.UserDAOImpl;
import com.itshare.banksystem.model.entities.User;
import java.util.List;

/**
 *
 * @author administratorlab
 */
public class UserBusinessLogicLayer {

    UserDAO userDao ;
    
    public UserBusinessLogicLayer(){
      userDao  = new UserDAOImpl();
    }

    public int insertUser(User user) {
            int rowsInserted = userDao.insert(user);
           
            if(rowsInserted == 1)
            {
                System.out.println("rows is = 1");
                return rowsInserted;}
            else
                 return 0;   
    }

    public int updateUser(User user) {
         int rowsUpdated = userDao.update(user);
           
            if(rowsUpdated == 1)
                return rowsUpdated;
            else
                 return 0;   
        
    }

    public int deleteUser(User user) {
 int rowsDeleted = userDao.delete(user);
           
            if(rowsDeleted == 1)
                return rowsDeleted;
            else
                 return 0;   
    }

    public User selectUser(User user) {

         User foundUser = userDao.select(user);
           
            if(foundUser == null)
                return null;
            else
                 return foundUser;
        
    }

    public List<User> selectAllUsers(User user) {

        List<User> users = userDao.selectAllUsingHQL();
        
        
          if(users == null)
                return null;
            else
                 return users;
    }

    
    
}
