package com.itshare.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.BasketballCoach;
import com.itshare.spring.coach.Coach;

public class SpringApp {

	
	public static void main(String[] args) {
		
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	Coach myCoach=context.getBean("basketball",Coach.class);

	System.out.println(myCoach.getMessage());


	
	context.close();
	
	
	}
}
