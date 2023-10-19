package com.itshare.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itshare.spring.coach.BasketballCoach;
import com.itshare.spring.coach.Coach;

@Configuration
public class SportConfig {

	
	@Bean
	public Coach getBasketball() {
		
		return new BasketballCoach();
	}
	

}
