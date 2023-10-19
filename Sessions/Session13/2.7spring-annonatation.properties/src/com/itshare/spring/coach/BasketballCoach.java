package com.itshare.spring.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.itshare.spring.message.MessageService;
import com.itshare.spring.message.NotificationMessage;

@Component
public class BasketballCoach implements Coach{


	@Value("ahmed")
	private String name;
	
	
	@Value("asdas@gmail.com")
	private String email;
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getCoachName() {
	
		return "i am basketball coach";
	}

	@Override
	public String getMessage() {
		
		return getName()+"  "+ getEmail();
	}
	
	
	
}
