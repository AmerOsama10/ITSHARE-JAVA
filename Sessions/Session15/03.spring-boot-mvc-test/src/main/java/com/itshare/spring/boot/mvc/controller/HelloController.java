package com.itshare.spring.boot.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;


//application flow
// 1- request mapping(/showForm)
// 2- controller
// 3- view -> hello.html

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