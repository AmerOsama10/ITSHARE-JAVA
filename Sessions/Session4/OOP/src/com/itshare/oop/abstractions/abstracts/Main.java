package com.itshare.oop.abstractions.abstracts;

public class Main {

	
	public static void main (String[] args) {
		
		
		JavaDevelopers java = new JavaDevelopers();
		int basicSalary = java.basicSalary();
		int bonus = java.bonus();
		String department = java.displayDepartment();
		
		
		System.out.println("The basic salary for java developers is :  "+basicSalary);
		System.out.println(bonus);
		System.out.println(department);
		System.out.println("=============================================");

		
		CyberSecurity cyber = new CyberSecurity();
		System.out.println(cyber.basicSalary());
		System.out.println(cyber.bonus());
		System.out.println(cyber.displayDepartment());

	}
}
