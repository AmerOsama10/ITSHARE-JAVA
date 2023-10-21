package com.itshare.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@RequestMapping("/")
	public List<Student> getStudents(){
		
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));
		
		return theStudents;
	}
	
	
	@RequestMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) throws Exception {
	List<Student> theStudents = new ArrayList<>();
	theStudents.add(new Student("Poornima", "Patel"));
	theStudents.add(new Student("Mario", "Rossi"));
	theStudents.add(new Student("Mary", "Smith"));
	
	if ( (studentId >= theStudents.size()) || (studentId < 0) ) {
		throw new Exception("Student id not found");
		}
	return theStudents.get(studentId);
	}

}
