package com.itshare.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itshare.hibernate.dao.StudentDAO;
import com.itshare.hibernate.dao.StudentDAOImpl;
import com.itshare.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App2 {
	static StudentDAOImpl studentDAO=new StudentDAOImpl();

	public static void main(String[] args) {
		Student student = new Student("dodododo", "saed", "ahmed.ramy@gmail");
		student.setId(10);
		//List<Student>list=studentDAO.selectAllStudentsUsingCriteria();
		Student x=studentDAO.selectStudent(student);

	//	studentDAO.deleteStudent(student);
		
		System.out.println(x);
		
	}
}
