package com.itshare.oop.encapsulation;

public class Person {

	private int age;
	private String name;

	//constructor
	public Person() {
		System.out.println("i am constructor");
	}
	
	
	public Person(int a , String n) {
		System.out.println("i am constructor two ");
		age=a;
		name =n;
	}
	
	public Person(int age , String name, int x) {
		System.out.println("i am constructor three ");
	}
	

	
}
