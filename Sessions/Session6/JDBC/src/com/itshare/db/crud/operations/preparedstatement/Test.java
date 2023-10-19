package com.itshare.db.crud.operations.preparedstatement;

import java.sql.*;



public class Test {

	final static String url="jdbc:mysql://localhost:3306/center";
	final static String user="root";
	final static String password ="root";

	
	
	void selectAll() {
		 String query ="select * from categories;";

		try {
			
			//1- CONNECTION
			Connection con=DriverManager.getConnection(url,user ,password );
			
			// 2- create statment / query
			PreparedStatement stat=con.prepareStatement(query);
			
			
			// 3- execute statment / query
			ResultSet set =stat.executeQuery();
			
			
			// 4- get / fetch data 
			while(set.next()) {
				
				int id = set.getInt("Id");
				String desc = set.getString("description");
				
				System.out.println(id +"    "+desc);
			}
			
			
			con.close();
			//5- close connection
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
	}
	
	
	void insert(int id , String desc){
		// quote + variable + quote 
		 String query ="insert into categories (id,description)  values (?,?);";

		try {
			
			//1- CONNECTION
			Connection con=DriverManager.getConnection(url, user, password);
			
			// 2- create statment / query
			PreparedStatement stat=con.prepareStatement(query);
			
			stat.setInt(1, id);
			stat.setString(2, desc);
						
			
			// 3- execute statment / query
			int rowsAffcted =stat.executeUpdate();
			
			
			// 4- get / fetch data 
			System.out.println(rowsAffcted);
			if(rowsAffcted == 0) {
				System.out.println("there is no rows inserted");
			}else
				System.out.println("there is "+rowsAffcted +"  afected");
			
			
			//5- close connection
			
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("this user is already in the database");
		}
	}
	
	
	void select(int x) {
		 String query ="select * from categories where id=?" ;

		try {
			
			//1- CONNECTION
			Connection con=DriverManager.getConnection(url, user, password);
			
			// 2- create statment / query
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, x);
			
			
			// 3- execute statment / query
			ResultSet set =stat.executeQuery();
			
			
			// 4- get / fetch data 
			while(set.next()) {
				
				int id = set.getInt("Id");
				String desc = set.getString("description");
				
				System.out.println(id +"    "+desc);
			}
			
			
			//5- close connection
			con.close();
			stat.close();
			set.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	void update(int id , String desc){
		// quote + variable + quote 
		 String query ="update categories set description =? where id=? ;";

		try {
			
			//1- CONNECTION
			Connection con=DriverManager.getConnection(url, user, password);
			
			// 2- create statment / query
			PreparedStatement stat=con.prepareStatement(query);
			stat.setString(1, desc);
			stat.setInt(2, id);
			
			// 3- execute statment / query
			int rowsAffcted =stat.executeUpdate();
			
			
			// 4- get / fetch feedback 
			System.out.println(rowsAffcted);
			
			
			//5- close connection
			
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("this user is already in the database");
		}
	}
	
	
	
	void delete(int id){
		// quote + variable + quote 
		 String query ="delete from categories where id=?";

		try {
			
			//1- CONNECTION
			Connection con=DriverManager.getConnection(url, user, password);
			
			// 2- create statment / query
			PreparedStatement stat=con.prepareStatement(query);
			
			stat.setInt(1, id);
			
			// 3- execute statment / query
			int rowsAffcted =stat.executeUpdate();
			
			
			// 4- get / fetch feedback 
			System.out.println(rowsAffcted);
			
			
			//5- close connection
			
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("this user is already in the database");
		}
	}
}
