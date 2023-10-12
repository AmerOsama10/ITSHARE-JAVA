package com.itshare.spring.coach;


//1-spring app
public class BaseballCoach implements Coach {


	public BaseballCoach() {
		System.err.println("2- BaseballCoach - no args constructor");
	}


	@Override
	public String getDailyWorkout() {
		return "2- BaseballCoach -  ok thats baseball coach";
	}

	@Override
	public String getDailyMessage() {
		return "2- BaseballCoach - Good Morninig";

	}

}
