package com.itshare.spring.boot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itshare.spring.boot.rest.entity.Student;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	List<Student> students= new ArrayList<>();

//	public StudentRestController() {
//    	Student s1=new Student("amer","osama");
//    	Student s2=new Student("ahmed","saed");
//    	Student s3=new Student("menna","hany");
//
//    	students.add(s1);
//    	students.add(s2);
//    	students.add(s3);
//	}
	
	
	@PostConstruct
	public void loadData() {
		
    	Student s1=new Student("amer","osama");
    	Student s2=new Student("ahmed","saed");
    	Student s3=new Student("menna","hany");

    	students.add(s1);
    	students.add(s2);
    	students.add(s3);
	}

    @GetMapping("/students")
    public List<Student> getStudents() {

        return students;  //jakson will convert List to json array
    }
    
    
    
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
    
    	Student student = students.get(id);
        return student;  
    }

 

}
