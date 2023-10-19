package com.itshare.spring.message;

public class NotificationMessage implements MessageService{
	
	public NotificationMessage() {
		System.err.println("I am Notification Message");
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
