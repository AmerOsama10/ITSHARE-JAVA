package com.itshare.session3.oop.abstraction.ex2;

public class Main {
	 public static void main(String[] args) {
		 
	     Shape circle = new Circle(5.0);
	     double area1 = circle.getArea();
	     System.out.println("Area of Circle: " + area1); // Output: Area of Circle: 78.53981633974483
	     circle.displayShapeType(); // Output: This is a shape.
	     
	     Shape rectangle = new Rectangle(4.0, 3.0);
	     double area2 = rectangle.getArea();
	     System.out.println("Area of Rectangle: " + area2); // Output: Area of Rectangle: 12.0
	     rectangle.displayShapeType(); // Output: This is a shape.
	 }
	}