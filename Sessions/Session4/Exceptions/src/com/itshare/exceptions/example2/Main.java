package com.itshare.exceptions.example2;

public class Main {

	
	public static void main ( String[] args) {
		
		Calculator cal = new Calculator();
		
		try {
		
			
			int x   = cal.divide(2, 0);
			
			
			System.out.println(x);
			
		
		}
		

		
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
}
