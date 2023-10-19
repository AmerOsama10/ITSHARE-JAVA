package com.itshare.oop.functions;

public class Calculator {

	
	public static int sum(int num1 ,int num2) {
		
		return num1+num2;
	}
	
	
	public static int sub(int num1 ,int num2) {
		
		
		return num1-num2;
	}
	
	public int div(int num1 ,int num2) {
		
		
		return num1/num2;
	}
	
	public static int mul(int num1 ,int num2) {
		
		
		return num1*num2;
	}
	
	
	
	
	
	public static void main(String[] args) {

		
		// normal 
		System.out.println(sum(10,20));
		
		// using object
		Calculator cal = new Calculator();
		int div = cal.div(20, 10);
		System.out.println(div);
		
		
		//using class
		System.out.println(Calculator.mul(20, 10));
		
		
		
	}
}
