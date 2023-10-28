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
@RequestMapping("first")
public class FirstController{
	
	@RequestMapping("/showForm")
	public String showForm() {
	
		return "First/hello-form";
	}
	

	@GetMapping(path="/processForm")
	public String processForm(@RequestParam("name") String name,Model model) {
	
		name= name.toUpperCase();
		model.addAttribute("name",name);
		
		return "First/process-form";
	}
	
	
}