package com.itshare.spring.boot.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;


//read data from user - convert it to upper case - add upper case to the model

@Controller
public class HelloController{
	
	@RequestMapping("/showForm")
	public String showForm() {
	
		return "hello-form";
	}
	
	@RequestMapping("/processFormV2")
	public String processForm(HttpServletRequest request,Model model) {
	
		String name= request.getParameter("name");
		name= name.toUpperCase();
		System.out.println(name);
		model.addAttribute("name",name);
		
		return "process-form";
	}
	
	
}