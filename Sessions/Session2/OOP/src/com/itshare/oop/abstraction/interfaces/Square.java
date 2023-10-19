package com.itshare.oop.abstraction.interfaces;

public class Square implements Shape{

	@Override
	public void area(int side) {
		System.out.println(side*side);
		
	}

}
