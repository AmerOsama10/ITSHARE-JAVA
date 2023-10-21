	package com.itshare.rest.dao;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	
	import com.itshare.entites.Student;
	
	
	
	public interface StudentRepository extends JpaRepository<Student, Long> {
	}