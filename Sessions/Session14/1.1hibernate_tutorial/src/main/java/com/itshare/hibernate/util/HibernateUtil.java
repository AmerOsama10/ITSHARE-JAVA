/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.hibernate.util;

import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.itshare.hibernate.entity.Student;

/**
 *
 * @author administratorlab
 */
public class HibernateUtil {

	   private static SessionFactory sessionFactory;

	    public static SessionFactory buildSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                Configuration config = new Configuration()
	                		.configure()
	                		.addAnnotatedClass(Student.class);
	                sessionFactory = config.buildSessionFactory();
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	        return sessionFactory;
	    }

	    public static Session openSession() {
	        SessionFactory factory = buildSessionFactory();
	        return factory.openSession();
	    }

	    public static void closeSession(Session session) {
	        if (session != null && session.isOpen()) {
	            session.close();
	        }
	    }
	}