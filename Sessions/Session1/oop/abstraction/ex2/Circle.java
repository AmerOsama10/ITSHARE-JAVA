package com.itshare.session3.oop.abstraction.ex2;



//Concrete class representing a Circle
public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
