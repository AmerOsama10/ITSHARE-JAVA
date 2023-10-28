package com.itshare.spring.boot.mvc.crud.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itshare.spring.boot.mvc.crud.model.Employee;
import com.itshare.spring.boot.mvc.crud.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	//dependency injection since its only one constructor
	public EmployeeController( EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	@GetMapping("/list")
	public String listEmployees(Model model) {

		List<Employee> employees=employeeService.findAll();

		model.addAttribute("employees",employees);
		return "employees/list-employees";
	}
}









