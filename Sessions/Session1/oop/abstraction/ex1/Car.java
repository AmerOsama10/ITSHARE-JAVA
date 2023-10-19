package com.itshare.session3.oop.abstraction.ex1;

//Concrete class representing a Car
public class Car extends Vehicle {
	public Car(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println("Car starting...");
	}
}
