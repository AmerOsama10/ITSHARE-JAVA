package com.itshare.spring.coach;

import org.springframework.beans.factory.DisposableBean;

import com.itshare.spring.message.MessageService;

public class TrackCoach implements Coach , DisposableBean {

	
	// define a private field for the dependency
		private MessageService messageService;
		
		
		// define a constructor for dependency injection
		
		public TrackCoach( ) {
			System.err.println("TrackCoach - no args constructor");
		}
		
		public TrackCoach(MessageService theMessageService ) {
			System.err.println("TrackCoach - with MessageService parameter args constructor");
			messageService = theMessageService;
		}
		
	
		// tightly coupled 
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}


	@Override
	public String getDailyMessage() {
		// TODO Auto-generated method stub
		return "Just do it + "+messageService.getHappyMessage();
	}
	
	// add an init method
	public void doStuff() {
		System.out.println("TrackCoach : inside method doStuff ");
	}
	
	// add an destroy method
	public void cleanStuff() {
		System.out.println("TrackCoach : inside method cleanStuff ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach : inside method destroy ");
		
	}
	


}
