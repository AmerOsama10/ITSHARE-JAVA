package com.itshare.spring.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.itshare.spring.message.MessageService;
import com.itshare.spring.message.NotificationMessage;

@Component
public class BasketballCoach implements Coach{

	
	private MessageService message  ;
	
	
	@Autowired
	public BasketballCoach(@Qualifier("notificationMessage")MessageService message){
		this.message=message;
		System.out.println("hello from BasketballCoach");
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
