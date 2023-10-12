package com.itshare.spring.message;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class RandomMessageService implements MessageService {

	private String[]data= {"Be aware of the wolf in sheep's clothing" ,
						   "Diligence is the mother of good luck",
						   "The journey is the reward"};
	
	private Random random = new Random();
	@Override
	public String getMessage() {
		int index=random.nextInt(data.length);
		String message = data[index];
		return message;
	}
	
	


}
