package com.itshare.spring.boot.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// a set of web pages + collection of spring beans (controllers - services) + configurations (xml+annotation + java) 	

//component 
//1- front controller (made by spring dev team)
//2- model (data ) - controller (business logic)
// controller (developer) -- handle request - store or retrieve data to db - place data to model - send it to view
// model -- data itself -- store or retrieve data to db - place data to model
// view -- spring mvc is flexiable support many templates
@Controller
public class DemoController{
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		Date date = new Date();
		model.addAttribute("date",date);
		
		//this will auto configure to use thymeleaf
		// thats mean there should be page called hello.html under path /templates
		return "hello";
	}
	
	
}