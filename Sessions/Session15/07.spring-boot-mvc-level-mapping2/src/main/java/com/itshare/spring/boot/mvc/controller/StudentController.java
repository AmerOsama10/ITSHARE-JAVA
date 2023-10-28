package com.itshare.spring.boot.mvc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import jakarta.servlet.http.HttpServletRequest;


//read data from user - convert it to upper case - add upper case to the model

@Controller
public class StudentController{
	
	@RequestMapping("/showStudentForm")
	public String showForm(Model model) {
	
		//1. create student object
		Student student= new Student();
		
		//2. add student object to the model
		model.addAttribute("student",student);
		return "student-form";
	}
	

	@PostMapping(path="/processForm")
	public String processForm(@ModelAttribute("")) {
	
		//System.err.println(student.getFirstName());
		//System.err.println(student.getLastName());
		
		return "confirm-form";
	}
	
	
}