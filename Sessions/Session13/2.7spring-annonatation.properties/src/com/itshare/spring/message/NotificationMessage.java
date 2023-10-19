package com.itshare.spring.message;

import org.springframework.stereotype.Component;

@Component
public class NotificationMessage implements MessageService{
	
	public NotificationMessage() {
		System.err.println("I am Notification Message : empty constructor");
	}
	
	public NotificationMessage(int x) {
		System.err.println("I am Notification Message : parametrized constructor");
	}

	@Override
	public String getHappyMessage() {
		return "You win today congratulations";
	}

	@Override
	public String getSadMessage() {
		return "Bad luck u lost";
	}
	
	

}
