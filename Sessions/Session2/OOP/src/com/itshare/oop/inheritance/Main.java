package com.itshare.oop.inheritance;

public class Main {

	public static void main(String[] args) {

		
		Animal animal = new Animal();
		animal.drink();
		animal.eat();

		System.out.println("-----------------------------");
		Dog dog = new Dog();
		dog.drink();
		dog.eat();
		dog.makeSound();
		
		System.out.println("-----------------------------");
		Cat cat = new Cat();
		cat.drink();
		cat.eat();
		
		System.out.println("-----------------------------");
		HaskyDog hasky = new HaskyDog();
		hasky.drink();
		hasky.eat();
		hasky.makeSound();
		hasky.hisNature();
	}

}
