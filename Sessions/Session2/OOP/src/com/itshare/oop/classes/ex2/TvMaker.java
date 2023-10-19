package com.itshare.oop.classes.ex2;

public class TvMaker {

	
	int sound;
	int channel=10; 
	String x ;
	
	
	void turnOff() {
		System.out.println("Tv is closed");
	}
	
	void turnOn() {
		System.out.println("Tv is Opening");
	}
	
	
	void setChannel(int chan) {
		if(chan>0)
		channel=chan;
	}
	
	
	void setafterchannel() {
		
		channel= channel+1; 
		
	}
	
	void setbeforechannel() {
		
		channel= channel-1; 
		
	}
	
}
