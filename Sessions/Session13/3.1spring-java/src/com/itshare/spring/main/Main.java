package com.itshare.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itshare.spring.coach.Coach;
import com.itshare.spring.configuration.SportConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach myCoach = context.getBean(Coach.class);
		
		System.out.println(myCoach.getCoachName());
		
	}

}
