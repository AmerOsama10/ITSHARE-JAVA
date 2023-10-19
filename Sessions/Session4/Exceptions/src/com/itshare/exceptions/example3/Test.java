package com.itshare.exceptions.example3;

public class Test {

	public static void main(String[] args) {

		
		String name=null ;
		
		try {
			
			
			
		int x = name.length();
		
		System.out.println(x);
		
		
		
		
		}
		
		
		
		
		catch (NullPointerException e) {
			
			
			System.out.println("This is wrong just assign a value to the name");
		}
		
		
		
	}

}
