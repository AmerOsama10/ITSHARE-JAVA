package com.itshare.spring.boot.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itshare.spring.boot.mvc.model.Student;


@Controller
public class StudentController{
	  @Value("${countries}")
	    private List<String> countries;

	
	@RequestMapping("/showStudentForm")
	public String showForm(Model model) {
	
		 // create a student object
        Student theStudent = new Student();

        // add student object to the model
        model.addAttribute("student", theStudent);

        // add the list of countries to the model
        model.addAttribute("countries", countries);
        
		return "student-form";
	}
	

	

	@PostMapping(path="/processForm")
	public String processForm(@ModelAttribute("student") Student student ) {
	
		System.err.println(student.getFirstName());
		System.err.println(student.getLastName());
		
		return "confirm-form";
	}
	
	

	
}