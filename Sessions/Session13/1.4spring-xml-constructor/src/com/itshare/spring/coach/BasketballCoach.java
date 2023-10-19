package com.itshare.spring.coach;

import com.itshare.spring.message.MessageService;
import com.itshare.spring.message.NotificationMessage;

public class BasketballCoach implements Coach{

	private MessageService message  ;
	
	public BasketballCoach() {
		
		System.err.println("Hello from Basketball empty Constructor");
	}
	
	public BasketballCoach(MessageService message) {
		
		this.message = message ;
		System.err.println("Hello from Basketball parametrized Constructor");
	}
	
	
	@Override
	public String getCoachName() {
	
		return "i am basketball coach";
	}

	@Override
	public String getMessage() {
		
		return message.getHappyMessage();
	}
}
