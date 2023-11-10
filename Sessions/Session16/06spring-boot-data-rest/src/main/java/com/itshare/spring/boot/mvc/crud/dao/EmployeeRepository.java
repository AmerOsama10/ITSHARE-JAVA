package com.itshare.spring.boot.mvc.crud.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.itshare.spring.boot.mvc.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	// that's it ... no need to write any code LOL!
	
}