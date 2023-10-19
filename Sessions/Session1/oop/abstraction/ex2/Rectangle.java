package com.itshare.session3.oop.abstraction.ex2;

//Concrete class representing a Rectangle
public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
}
