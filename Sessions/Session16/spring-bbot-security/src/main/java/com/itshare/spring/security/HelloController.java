package com.itshare.spring.security;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
	
	
	
	
}