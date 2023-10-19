package com.itshare.session3.oop.abstraction.ex2;

//Abstract class representing a Shape
abstract class Shape {
	// Abstract method to calculate area
	public abstract double getArea();

	// Concrete method to display the shape type
	public void displayShapeType() {
		System.out.println("This is a shape.");
	}
}