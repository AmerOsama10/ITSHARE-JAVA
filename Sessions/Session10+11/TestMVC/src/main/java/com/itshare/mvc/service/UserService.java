package com.itshare.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.itshare.mvc.model.Users;

public class UserService  {

    public UserService() {
    }

	
public List<Users> getAllUsers(){
	
	Users user1 = new Users("ahmed", "ahmed@gmail");
	Users user2 = new Users("mohamed", "mohamed@gmail");
	Users user3 = new Users("hany", "hany@gmail");
	Users user4 = new Users("mena", "mena@gmail");
	Users user5 = new Users("heba", "heba@gmail");
	
	List<Users> allUsers = new ArrayList<Users>();
	allUsers.add(user1);
	allUsers.add(user2);
	allUsers.add(user3);
	allUsers.add(user4);
	allUsers.add(user5);

	
	return allUsers;
}

}
