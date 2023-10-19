package com.itshare.spring.coach;

import com.itshare.spring.message.MessageService;
import com.itshare.spring.message.NotificationMessage;

public class BasketballCoach implements Coach{

	private MessageService message  ;
	
	public BasketballCoach(MessageService message) {
		
		this.message = message ;
		System.err.println("Hello from BasketballCoach Constructor");
	}
	
	
	@Override
	public String getCoachName() {
		System.out.println("Hello from getCoachName ");

		return "i am basketball coach";
	}

	@Override
	public String getMessage() {
		
		return message.getHappyMessage();
	}
	
	
	public void inStart() {
		System.out.println("Hello from start ");

	}
	
	
	public void inEnd() {
		System.out.println("Hello from end ");

	}
}
