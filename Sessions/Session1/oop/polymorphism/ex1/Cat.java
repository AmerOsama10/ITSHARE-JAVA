package com.itshare.session3.oop.polymorphism.ex1;

public class Cat extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat Sound");
	}
	
	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}

	
	public void Run() {
		System.out.println("cat : i am running");
	}
	
}
