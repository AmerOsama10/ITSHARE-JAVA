package com.itshare.spring.boot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itshare.spring.boot.rest.entity.Student;
import com.itshare.spring.boot.rest.entity.StudentErrorResponse;
import com.itshare.spring.boot.rest.exception.StudentNotFoundException;

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
    
    
    //step 3: handling the case of exception
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
    
    	if(id >=students.size() || id<0 )
    	{
    		throw new StudentNotFoundException("student id not found - "+id);
    	}
    	Student student = students.get(id);
        return student;  
    }

    
    
    //step 4 : add exception handler method
    
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex){
		
    	StudentErrorResponse error = new StudentErrorResponse();
    	error.setStatus(HttpStatus.NOT_FOUND.value());
    	error.setMessage(ex.getMessage());
    	error.setTimeStamp(System.currentTimeMillis());
    	
    	
    	ResponseEntity<StudentErrorResponse> response = new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    	
    	
    	
    	return response;
    	
    }
    
 

}
