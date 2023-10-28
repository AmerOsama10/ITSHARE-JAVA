package com.itshare.spring.boot.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


//read data from user - convert it to upper case - add upper case to the model

@Controller
public class HelloController{
	
	@RequestMapping("/showForm")
	public String showForm() {
	
		return "hello-form";
	}
	
	//Get --> good for debugging - bookmark - limitation on data length
	//post--> can also send binary data - cant bookmark -no limitation on data length
	@RequestMapping(path="/processForm" , method=RequestMethod.GET)
	public String processForm(@RequestParam("name") String name,Model model) {
	
		name= name.toUpperCase();
		model.addAttribute("name",name);
		
		return "process-form";
	}
	
	@PostMapping(path="/processForm2")
	public String processForm2(@RequestParam("name") String name,Model model) {
	
		name= name.toUpperCase();
		model.addAttribute("name",name);
		
		return "process-form";
	}
	
	
}