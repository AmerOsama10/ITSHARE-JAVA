package com.itshare.session3.oop.polymorphism.ex1;

public class Main {

	public static void main(String[] args) {

		//normal creating objects
		Animal animal = new Animal();
		animal.eat();
		animal.makeSound();
		System.out.println("------------------");

		//normal creating objects
		Dog dog = new Dog();
		dog.eat();
		dog.makeSound();
		System.out.println("------------------");

		//normal creating objects
		Cat cat = new Cat();
		cat.eat();
		cat.makeSound();
		cat.Run();
		System.out.println("------------------");
		
		//Do you know what is instance of ??
		System.out.println(animal instanceof Animal); // Output: true
		System.out.println(animal instanceof Dog);    // Output: false
		System.out.println(animal instanceof Cat);    // Output: false
		System.out.println("------------------");

		System.out.println(dog instanceof Dog); // Output: false
		System.out.println(dog instanceof Animal); // Output: true
		System.out.println("------------------");

		System.out.println(cat instanceof Cat); // Output: false
		System.out.println(cat instanceof Animal); // Output: true
		System.out.println("------------------");

		// Up casting
		Animal object1 = new Dog();
		object1.makeSound();
		object1.eat();
		System.out.println("------------------");

		Animal object2 = new Cat();
		object2.makeSound();
		object2.eat();
		// object2.Run();
		((Cat) object2).Run();
		System.out.println("------------------");

		//Down Casting
		Animal animal2 = new Cat();
		Cat cat2 = (Cat) animal2;
		cat2.makeSound();
		cat2.eat();
		cat2.Run();
		System.out.println("------------------");

	}
}
