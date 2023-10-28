package com.itshare.mvc.model;


//POJO class
public class Users {

	private String username;
	private String gmail;
	
	
	public Users(String username,String gmail) {
		this.username=username;
		this.gmail=gmail;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}



	
	
}
