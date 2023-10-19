package com.itshare.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.Coach;

public class SpringApp {

	
	public static void main(String[] args) {
		
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	Coach myCoach=context.getBean("basketball",Coach.class);
	
	Coach myCoach2=context.getBean("basketball",Coach.class);
	
	Coach myCoach3=context.getBean("basketball",Coach.class);

	
	System.out.println(myCoach == myCoach2);
	System.out.println(myCoach);
	System.out.println(myCoach2);
	System.out.println(myCoach3);

	
	context.close();
	
	
	}
}
