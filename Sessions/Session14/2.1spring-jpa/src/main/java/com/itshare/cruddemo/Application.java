package com.itshare.cruddemo;

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
	
//	@Bean
//	public CommandLineRunner command(String[] args) {
//		return runner->{System.out.println("hello world");};
//		
//	}
//	
	
//	@Bean
//	public CommandLineRunner command(StudentDAO studentDao) {
//		return runner->{
//			
//			Student student = new Student("fady","osama","amer.osama@gmail.com");
//			studentDao.save(student);
//			
//		};
//		
//	}
	
	
	@Bean
	public CommandLineRunner command(StudentDAO studentDao) {
		return runner->{
			
			Student student1 = new Student("tarek","tarek","tarek.osama@gmail.com");
			Student student2 = new Student("hany","hany","hany.osama@gmail.com");
			Student student3 = new Student("kamal","kamal","kamal.osama@gmail.com");

			studentDao.save(student1);
			studentDao.save(student2);
			studentDao.save(student3);

			
		};
		
	}
	
	
	
	

}
