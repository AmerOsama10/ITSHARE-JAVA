package com.itshare.spring.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.itshare.spring.message.MessageService;
import com.itshare.spring.message.NotificationMessage;

@Component
@Scope("prototype")
public class BasketballCoach implements Coach{

	@Autowired
	@Qualifier("notificationMessage")
	private MessageService message  ;
	
	

	
	public BasketballCoach(){
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
