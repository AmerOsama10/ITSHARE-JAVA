package com.itshare.main;

import com.itshare.main.coach.BasketballCoach;
import com.itshare.main.coach.Coach;

public class NoSpringApp {

	public static void main(String[] args) {
		
		Coach object  =new BasketballCoach();
		System.out.println(object.getCoachName());
		
	}

}
