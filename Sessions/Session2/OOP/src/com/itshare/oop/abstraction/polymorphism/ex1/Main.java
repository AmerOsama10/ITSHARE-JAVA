package com.itshare.oop.abstraction.polymorphism.ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		SoftwareEngineer soft = new SoftwareEngineer();
//		soft.salary();
//		soft.eat();
//		soft.function();
//		
//		System.out.println("--------------------------");
//		CyberSecurity cyber = new CyberSecurity();
//		cyber.salary();
//		cyber.eat();
		
		
		//up casting
		Employee soft = new SoftwareEngineer();
		soft.salary();
		soft.eat();
		soft.bonus();
		
		
		
		Employee cyber = new CyberSecurity();
		cyber.eat();
		cyber.salary();
		cyber.bonus();
		
		System.out.println("--------------------------");

		System.out.println(soft instanceof Employee);
		System.out.println(soft instanceof SoftwareEngineer);
		System.out.println(soft instanceof CyberSecurity);


		
		

	}

}
