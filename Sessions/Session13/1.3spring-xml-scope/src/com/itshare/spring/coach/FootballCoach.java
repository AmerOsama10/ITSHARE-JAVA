package com.itshare.spring.coach;

public class FootballCoach implements Coach{
	public FootballCoach() {
		System.out.println("Hello from FootballCoach Constructor");
	}
	
	@Override
	public String getCoachName() {
	
		return "i am football coach";
	}

	@Override
	public String getMessage() {
		
		return "Football : You are fit";
	}

}
