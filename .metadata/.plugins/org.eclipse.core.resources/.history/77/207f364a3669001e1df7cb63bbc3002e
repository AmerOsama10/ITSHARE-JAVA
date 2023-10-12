package com.itshare.spring.app;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itshare.spring.coach.SwimCoach;


// send values 
// properties

public class PropertiesSpringApp {
	public static void main(String[]args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		//call a method on the bean
		System.out.println(coach.getName());
		System.out.println(coach.getEmail());
		//coach.Print();

		//close the context
		context.close();
	}
}
