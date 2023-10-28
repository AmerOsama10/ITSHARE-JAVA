package com.itshare.spring.boot.mvc.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itshare.spring.boot.mvc.crud.dao.EmployeeRepository;
import com.itshare.spring.boot.mvc.crud.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);
		
		Employee theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
//		 if (theEmployee.getId() == 0) {
//		        // If the ID is 0, it's a new employee; save it as a new record.
//		        employeeRepository.save(theEmployee);
//		    }else {
//		        // If the ID is not 0, it's an existing employee; update the record.
//		        Employee existingEmployee = findById(theEmployee.getId());
//		        existingEmployee.setFirstName(theEmployee.getFirstName());
//		        existingEmployee.setLastName(theEmployee.getLastName());
//		        existingEmployee.setEmail(theEmployee.getEmail());
//		        employeeRepository.save(existingEmployee);
//		    }
		
     employeeRepository.save(theEmployee);

		 
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}

}






