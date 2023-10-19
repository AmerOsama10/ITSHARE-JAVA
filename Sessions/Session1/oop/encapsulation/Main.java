package com.itshare.session3.oop.encapsulation;

public class Main {

	public static void main(String[] args) {

		//using setters
		Person person1 = new Person();		
		person1.setName("ahmed");
		person1.setAge(10);
		System.out.println(person1.getName() + "    "+person1.getAge() );
		
		
		//using constructor
		Person person2 = new Person("amer",12);
		System.out.println(person2.getName() + "    "+person2.getAge() );

		
		Person person3 = new Person("ahmed");
		System.out.println(person3.getName() + "    "+person3.getAge() );
		
	}

}
