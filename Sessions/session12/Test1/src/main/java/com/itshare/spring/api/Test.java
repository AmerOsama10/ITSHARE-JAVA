package com.itshare.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Test {

	
	@GetMapping("/")
	public String sayHello() {
		
		String x = "heloo my world";
		return x;
	}
	
	
	@GetMapping("/play")
	public String play() {
		
		return "i am playing football";
	}
	
	@GetMapping("/test")
	public String test() {
		
		return "i am test";
	}
	
	@PostMapping("/divide")
	public int divide() {
		
		
		return 10/2;
	}
	

	@GetMapping("/sum")
	public String sum() {
		int num1=10;
		int num2=20;
		int sum = num1+num2;
		
		return ""+sum;
	}
	
}
