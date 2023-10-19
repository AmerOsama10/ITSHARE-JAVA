/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.banksystem.model.daos;

import com.itshare.banksystem.model.entities.Client;
import com.itshare.banksystem.model.util.HibernateManager;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author administratorlab
 */
public class ClientDAOImpl implements ClientDAO {

    @Override
    public int insertClient(Client client) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //save client
            session.save(client);

            //commit transaction
            transaction.commit();
            System.out.println("row is inserted succesfully");
            return 1;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return 0;
    }

    @Override
    public int updateClient(Client client) {

        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //save client
            session.saveOrUpdate(client);

            //commit transaction
            transaction.commit();
            return 1;
        } catch (HibernateException ex) {
            transaction.rollback();
        }

        return 0;
    }

    @Override
    public int deleteClient(Client client) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //save client
            session.delete(client);

            //commit transaction
            transaction.commit();
            return 1;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return 0;
    }

    @Override
    public List<Client> selectAllClientsUsingHQL() {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //select all client
            String hQuery = "From Client";
            Query query = session.createQuery(hQuery);
            List<Client> result = query.list();

            //commit transaction
            transaction.commit();
            return result;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return null;
    }

    public List<Client> selectAllClientsUsingSQL() {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //select all client
            String nativeQuery = "Select * from clients";
            SQLQuery query = session.createSQLQuery(nativeQuery);
            query.addEntity(Client.class);
            List<Client> result = query.list();

            //commit transaction
            transaction.commit();
            return result;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return null;
    }

    public List<Client> selectAllClientsUsingCriteria() {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateManager.buildSessionFactory().openSession();

            //start transaction
            transaction = session.beginTransaction();

            //select all client
            //select * from clients where id >=9 order by firstname desc;
            Criteria criteria = session.createCriteria(Client.class);
            criteria.add(Restrictions.ge("id", 5));
            criteria.add(Restrictions.like("firstname", "ahmed", MatchMode.ANYWHERE));
//            
//            criteria.addOrder(Order.desc("firstname"));
//            criteria.add(Restrictions.le("id", 8));
//            criteria.add(Restrictions.like("firstname", "ho", MatchMode.ANYWHERE));
//            
            List<Client> result = criteria.list();
            //commit transaction
            transaction.commit();
            return result;
        } catch (HibernateException ex) {
            transaction.rollback();
        }
        return null;
    }

    @Override
    public Client selectClient(Client client) {

        Transaction transaction = null;
        Session session = null;
        Client foundClient = null;

        try {
            session = HibernateManager.getNewSession();

            //start transaction
            transaction = session.beginTransaction();
            //save client
            foundClient = (Client) session.get(Client.class, client.getId());
            //commit transaction
            transaction.commit();
            
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return foundClient;
    }

}
