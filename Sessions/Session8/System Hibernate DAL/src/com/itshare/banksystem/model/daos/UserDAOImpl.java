/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.model.daos;

import com.itshare.banksystem.model.entities.User;
import com.itshare.banksystem.model.entities.User;
import com.itshare.banksystem.model.util.HibernateManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author administratorlab
 */
public class UserDAOImpl implements UserDAO {
    
    @Override
    public int insert(User user) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //save user
            session.save(user);

            //commit transaction
            transaction.commit();
            System.out.println("user created sucessfully");
            return 1;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return 0;
    }

    @Override
    public int update(User user) {

        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //save user
            session.saveOrUpdate(user);

            //commit transaction
            transaction.commit();
            return 1;
        } catch (HibernateException ex) {
            transaction.rollback();
        }

        return 0;
    }

    @Override
    public int delete(User user) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //save user
            session.delete(user);

            //commit transaction
            transaction.commit();
            return 1;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return 0;
    }

     @Override
    public List<User> selectAllUsingHQL() {
         Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //select all user
            String hQuery="From User";
            Query query=session.createQuery(hQuery);
            List<User> result=query.list();
           
            //commit transaction
            transaction.commit();
            return result;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return null;
    }
    
    
    public List<User> selectAllUsingSQL() {
         Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //select all user
            String nativeQuery="Select * from user";
            SQLQuery query=session.createSQLQuery(nativeQuery);
            query.addEntity(User.class);
            List<User> result=query.list();
           
            //commit transaction
            transaction.commit();
            return result;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return null;
    }

    
        
    public List<User> selectAllUsingCriteria() {
         Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //select all user
            
            //select * from users where id >=9 order by firstname desc;
            Criteria criteria= session.createCriteria(User.class);
            criteria.add(Restrictions.ge("id", 5));
            criteria.add(Restrictions.like("firstname", "ahmed", MatchMode.ANYWHERE));
//            
//            criteria.addOrder(Order.desc("firstname"));
//            criteria.add(Restrictions.le("id", 8));
//            criteria.add(Restrictions.like("firstname", "ho", MatchMode.ANYWHERE));
//            
            List<User> result =criteria.list();
            //commit transaction
            transaction.commit();
            return result;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return null;
    }
    
    @Override
    public User select(User user) {

        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //save user
            User foundUser =(User) session.get(User.class, user.getUsername());

            //commit transaction
            transaction.commit();
            return foundUser;
        } catch (HibernateException ex) {
            transaction.rollback();
            ex.printStackTrace();
        }
        return null;
    }

}
