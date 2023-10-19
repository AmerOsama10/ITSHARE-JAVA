package com.itshare.spring.coach;

import org.springframework.stereotype.Component;


@Component
public class BasketballCoach implements Coach{


	
	public BasketballCoach(){
		System.err.println("hello from BasketballCoach");
	}
	
	
	
	
	@Override
	public String getCoachName() {
	
		return "i am basketball coach";
	}

	
}
