package com.itshare.spring.boot.mvc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    @GetMapping("/students")
    public List<Student> getStudents() {
    	List<Student> students= new ArrayList<>();
    	Student s1=new Student("amer","osama");
    	Student s2=new Student("ahmed","saed");
    	Student s3=new Student("menna","hany");

    	students.add(s1);
    	students.add(s2);
    	students.add(s3);

        return students;  //jakson will convert List to json array
    }

 
}
