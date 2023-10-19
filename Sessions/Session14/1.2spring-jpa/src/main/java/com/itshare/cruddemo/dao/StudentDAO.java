package com.itshare.cruddemo.dao;

import java.util.List;

import com.itshare.cruddemo.entity.Student;

public interface StudentDAO {

	void save(Student student);

	Student findById(int id);

	List<Student> findAll();

	List<Student> findAllAsc();

	List<Student> findbyFirstName(String firstname);

	void update(Student student);

	void delete(int id);
	
	void deleteAll();


}
