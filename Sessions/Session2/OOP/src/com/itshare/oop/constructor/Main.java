package com.itshare.oop.constructor;

public class Main {



	public static void main(String []args) {
		
	Person p = new Person();
	System.out.println( p.getName());
	System.out.println( p.getAge());
	System.out.println( p.getSalary());
	System.out.println( "-------------------------------------------------");


	p.setName("ahmed");
	p.setSalary(10000);
	p.setAge(20);
	
	
	System.out.println( p.getName());
	System.out.println( p.getAge());
	System.out.println( p.getSalary());
	System.out.println( "-------------------------------------------------");
	
	
	}
	
}
