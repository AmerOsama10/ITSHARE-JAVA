package com.itshare.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itshare.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Create a Hibernate configuration based on the hibernate.cfg.xml file

		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory factory = config.buildSessionFactory();
		try {
			Session session = factory.openSession();
			// create a student object
			System.out.println("Creating new student object...");
			Transaction transaction = session.beginTransaction();
			Student student = new Student("reko--", "saed", "ahmed.ramy@gmail");
			session.save(student);
			transaction.commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}
}
