package com.itshare.session3.oop.abstraction.ex1;

//Abstract class representing a Vehicle
abstract class Vehicle {

	private String name;

	public Vehicle(String name) {
		this.name = name;
	}

	public abstract void start();

	public void display() {
		System.out.println("Vehicle name: " + name);
	}
}
