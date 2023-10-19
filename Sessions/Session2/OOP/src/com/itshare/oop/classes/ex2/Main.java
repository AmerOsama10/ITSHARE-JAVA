package com.itshare.oop.classes.ex2;

public class Main {

	public static void main(String[] args) {
		
		TvMaker object = new TvMaker();
		object.turnOn();
		System.out.println(" before setting a channel "+object.channel);
		
		
		object.setChannel(100);
		System.out.println(" after setting a channel "+object.channel);

		object.setafterchannel();
		System.out.println(" after increasing a channel by one "+object.channel);

	
		object.setafterchannel();
		System.out.println(" after increasing a channel by one "+object.channel);
		

		object.setafterchannel();
		System.out.println(" after increasing a channel by one "+object.channel);
		
		object.setbeforechannel();
		System.out.println(" after decreasing a channel by one "+object.channel);
		
		object.setbeforechannel();
		System.out.println(" after decreasing a channel by one "+object.channel);
		
		object.turnOff();

	}

}
