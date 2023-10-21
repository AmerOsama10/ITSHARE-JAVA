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
public class HibernateManager {

    private static SessionFactory sessionFactory;

    // build session factory
    public static SessionFactory buildSessionFactory() {

    	   if (sessionFactory == null) {
    	        try {
    	            // 2. If not, build the session factory
    	            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    	            configuration.addAnnotatedClass(Student.class); // Add annotated classes

    	            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
    	            serviceRegistryBuilder.applySettings(configuration.getProperties());

    	            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();

    	            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	        } catch (HibernateException ex) {
    	            ex.printStackTrace();
    	        }
    	    }
      return sessionFactory;
    }
    
    
    public static Session getNewSession(){
        Session session = buildSessionFactory().openSession();
        return session;
    }

}
