package com.itshare.spring.message;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class MobileMessage implements MessageService{
	
	public MobileMessage() {
		System.err.println("I am MobileMessage  : empty constructor");
	}
	
	public MobileMessage(int x) {
		System.err.println("I am MobileMessage  : parametrized constructor");
	}

	@Override
	public String getHappyMessage() {
		return "You win today congratulations : MobileMessage";
	}

	@Override
	public String getSadMessage() {
		return "Bad luck u lost : MobileMessage";
	}
	
	

}
