package com.itshare.cruddemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.itshare.cruddemo.dao.StudentDAO;
import com.itshare.cruddemo.entity.Student;

@SpringBootApplication
public class Application {

	@Autowired
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	

	}
	

	
@Bean
	public CommandLineRunner command(StudentDAO studentDao) {
		return runner->createMulipleStudent(studentDao);
		
	}
	
	
	private void createStudent(StudentDAO studentDao) {
		Student student = new Student("Ahmed","Tamer","Ahmed.tamer@gmail.com");
		studentDao.save(student);
		System.out.println(student);

	}
	
	private void createMulipleStudent(StudentDAO studentDao) {
		Student student1 = new Student("tarek","tarek","tarek.tarek@gmail.com");
		Student student2 = new Student("hany","hany","hany.hany@gmail.com");
		Student student3 = new Student("kamal","kamal","kamal.kamal@gmail.com");

		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		
	}
	


	
	private void findStudentById(StudentDAO studentDao) {
	
		Student foundStudent=studentDao.findById(4);
		System.out.println(foundStudent);
	}
	
	
	private void findAllStudents(StudentDAO studentDao) {
		
		List<Student> allStudents=studentDao.findAll();
		System.out.println(allStudents);
	}
	
	private void findAllStudentsAsc(StudentDAO studentDao) {
		
		List<Student> allStudents=studentDao.findAllAsc();
		System.out.println(allStudents);
	}
	
	private void findStudentByFirstName(StudentDAO studentDao) {
		
		List<Student> allStudents=studentDao.findbyFirstName("amer");
		System.out.println(allStudents);
	}
	
	
	private void updateStudent(StudentDAO studentDao) {
		int id=1;
		Student student=studentDao.findById(id);
		student.setFirstname("saed");
		studentDao.update(student);
		System.out.println(student);
	}

	
	private void deleteStudent(StudentDAO studentDao) {
		int id=2;
		studentDao.delete(id);
	}
	
	private void deleteAllStudents(StudentDAO studentDao) {
		studentDao.deleteAll();
	}
}
