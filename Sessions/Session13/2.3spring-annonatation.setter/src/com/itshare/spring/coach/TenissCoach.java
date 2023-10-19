package com.itshare.spring.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.itshare.spring.message.MessageService;
import com.itshare.spring.message.NotificationMessage;

@Component
public class TenissCoach implements Coach{
	
	public TenissCoach(){
		System.out.println("hello from tennis");
	}
	
	@Autowired
	@Qualifier("notificationMessage")
	private MessageService message  ;
	
	
	
	@Override
	public String getCoachName() {
	
		return "i am basketball coach";
	}

	@Override
	public String getMessage() {
		
		return message.getHappyMessage();
	}
}
