package com.itshare.session3.oop.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		animal.makeSound();	
		System.out.println("------------------");
		
		Dog dog = new Dog();
		dog.eat();
		dog.makeSound();
		System.out.println("------------------");
		
		Cat cat = new Cat();
		cat.eat();
		cat.makeSound();
		cat.Run();
		System.out.println("------------------");
	}
}
