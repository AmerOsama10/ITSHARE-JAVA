package com.itshare.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.Coach;

public class SpringApp {

	
	public static void main(String[] args) {
		
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	Coach myCoach=context.getBean("basketballCoach",Coach.class);
	Coach myCoach2=context.getBean("basketballCoach",Coach.class);

	System.out.println(myCoach == myCoach2);
	System.out.println(myCoach );
	System.out.println(myCoach2 );


	// break till 5:10
	context.close();
	
	
	}
}
