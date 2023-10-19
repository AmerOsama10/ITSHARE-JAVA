package com.itshare.session3.oop.abstraction.ex1;

//Concrete class representing a Motorcycle
public class Motorcycle extends Vehicle {
	public Motorcycle(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println("Motorcycle starting...");
	}
}
