package com.itshare.spring.test;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	
	public BasketballCoach() {
		System.out.println("Hello from Basketball");
	}
	
	@Override
	public String getDailyWork() {
		return "I am working as a Basketball player";
	}

}
