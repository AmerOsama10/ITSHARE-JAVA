package com.itshare.session3.oop.polymorphism.ex1;

public class Dog extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog Sound");
	}
	
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	
}
