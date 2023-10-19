/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.model.util;

import com.itshare.banksystem.model.entities.Client;
import com.itshare.banksystem.model.entities.User;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author administratorlab
 */
public class HibernateManager {

    private static SessionFactory sessionFactory;

    // build session factory
    public static SessionFactory buildSessionFactory() {

        //1. check if its already built or not
        try {
            if (sessionFactory == null) {
                
                //2. prepare papers
                Configuration config = new Configuration();
                
                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.put(Environment.URL, "jdbc:mysql://localhost:3306/Test");
                properties.put(Environment.USER, "root");
                properties.put(Environment.PASS, "");
                properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                properties.put(Environment.SHOW_SQL, "true");
                properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
                properties.put(Environment.HBM2DDL_AUTO, "update");
                config.setProperties(properties);
                
                config.addAnnotatedClass(User.class);
                config.addAnnotatedClass(Client.class);
                
                //     config.addAnnotatedClass(User.class);
                //config.addAnnotatedClass(Student.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(config.getProperties()).build();
                sessionFactory = config.buildSessionFactory(serviceRegistry);
                
            }
        } catch (HibernateException ex) {
            sessionFactory=null;
            ex.printStackTrace();
        }
      return sessionFactory;
    }
    
    
    public static Session getNewSession(){
        Session session = buildSessionFactory().openSession();
        return session;
    }

}
