package com.itshare.session3.oop.polymorphism.ex2;

public class Main {

	public static void main(String[] args) {
	
		Doctor doc = new Doctor();
		doc.work();
		doc.salary();
		doc.devices();
		System.out.println("-------------------------");
		HR hr = new HR();
		hr.work();
		hr.salary();
		hr.devices();
		System.out.println("-------------------------");
		IT it = new IT();
		it.work();
		it.salary();
		it.devices();

		
	}
}
