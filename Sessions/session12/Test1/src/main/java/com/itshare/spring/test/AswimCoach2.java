package com.itshare.spring.test;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class AswimCoach2 implements Coach {

	
	public AswimCoach2() {
		System.out.println("Hello from swim");
	}
	
	@Override
	public String getDailyWork() {
		return "I am working as a swim ";
	}

}
