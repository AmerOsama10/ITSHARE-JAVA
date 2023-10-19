package com.itshare.spring.coach;

public class BasketballCoach implements Coach{

	public BasketballCoach() {
		System.out.println("Hello fron BasketballCoach Constructor");
	}
	
	
	@Override
	public String getCoachName() {
	
		return "i am basketball coach";
	}

	@Override
	public String getMessage() {
		
		return "Basketball : You are taller";
	}
}
