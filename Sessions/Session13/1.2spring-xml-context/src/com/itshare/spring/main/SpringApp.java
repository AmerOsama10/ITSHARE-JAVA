package com.itshare.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.Coach;

public class SpringApp {

	
	public static void main(String[] args) {
		
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/itshare/spring/xml/applicationContext.xml");

	Coach myCoach=context.getBean("basketball",Coach.class);
	System.out.println(myCoach.getCoachName());
	System.out.println(myCoach.getMessage());
	
	
	Coach myCoach2 = context.getBean("x",Coach.class);
	System.out.println(myCoach2.getCoachName());
	System.out.println(myCoach2.getMessage());
	
	context.close();
	
	
	}
}
