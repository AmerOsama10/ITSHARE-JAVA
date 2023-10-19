package com.itshare.session3.oop.abstraction.ex1;

public class Main {

	public static void main(String[] args) {
			   Vehicle car = new Car("Toyota");
			   Vehicle motorcycle = new Motorcycle("Honda");

			   car.start(); // Output: Car starting...
			   motorcycle.start(); // Output: Motorcycle starting...

			   car.display(); // Output: Vehicle name: Toyota
			   motorcycle.display(); // Output: Vehicle name: Honda
			}

	}


