/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itshare.hibernate.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.itshare.hibernate.entity.Student;
import com.itshare.hibernate.util.HibernateManager;
import com.itshare.hibernate.util.HibernateUtil;

/**
 *
 * @author administratorlab
 */
public class StudentDAOImpl implements StudentDAO {

	@Override
	public int insertStudent(Student Student) {
		Transaction transaction = null;
		Session session = null;

		try {
			session = HibernateUtil.openSession();

			// start transaction
			transaction = session.beginTransaction();

			// save Student
			session.save(Student);

			// commit transaction
			transaction.commit();
			System.out.println("row is inserted succesfully");
			return 1;
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			HibernateUtil.closeSession(session);
		}
		return 0;
	}

	@Override
	public int updateStudent(Student Student) {

		Transaction transaction = null;
		Session session = null;

		try {
			session = HibernateUtil.openSession();

			// start transaction
			transaction = session.beginTransaction();

			// save Student
			session.saveOrUpdate(Student);

			// commit transaction
			transaction.commit();
			return 1;
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			HibernateUtil.closeSession(session);
		}

		return 0;
	}

	@Override
	public int deleteStudent(Student Student) {
		Transaction transaction = null;
		Session session = null;

		try {
			session = HibernateUtil.openSession();

			// start transaction
			transaction = session.beginTransaction();

			// save Student
			session.delete(Student);

			// commit transaction
			transaction.commit();
			return 1;
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			HibernateUtil.closeSession(session);
		}
		return 0;
	}

	@Override
	public List<Student> selectAllStudentsUsingHQL() {
		Transaction transaction = null;
		Session session = null;

		try {
			session = HibernateUtil.openSession();

			// start transaction
			transaction = session.beginTransaction();

			// select all Student
			String hQuery = "From Student";
			Query<Student> query = session.createQuery(hQuery);
			List<Student> result = query.list();

			// commit transaction
			transaction.commit();
			return result;
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			HibernateUtil.closeSession(session);
		}
		return null;
	}

	public List<Student> selectAllStudentsUsingSQL() {
		Transaction transaction = null;
		Session session = null;

		try {
			session = HibernateUtil.openSession();

			// start transaction
			transaction = session.beginTransaction();

			// select all Student
			String nativeQuery = "Select * from Student";
			SQLQuery<Student> query = session.createSQLQuery(nativeQuery);
			query.addEntity(Student.class);
			List<Student> result = query.list();

			// commit transaction
			transaction.commit();
			return result;
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			HibernateUtil.closeSession(session);
		}
		return null;
	}

	public List<Student> selectAllStudentsUsingCriteria() {
		Transaction transaction = null;
		Session session = null;

		try {
			session = HibernateUtil.openSession();

			// start transaction
			transaction = session.beginTransaction();

			// select all Student
			// select * from Students where id >=9 order by firstname desc;
			Criteria criteria = session.createCriteria(Student.class);
			criteria.add(Restrictions.ge("id", 5));
			criteria.add(Restrictions.like("firstname", "ahmed", MatchMode.ANYWHERE));
//            
//            criteria.addOrder(Order.desc("firstname"));
//            criteria.add(Restrictions.le("id", 8));
//            criteria.add(Restrictions.like("firstname", "ho", MatchMode.ANYWHERE));
//            
			List<Student> result = criteria.list();
			// commit transaction
			transaction.commit();
			return result;
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			HibernateUtil.closeSession(session);
		}
		return null;
	}

	@Override
	public Student selectStudent(Student Student) {

		Transaction transaction = null;
		Session session = null;
		Student foundStudent = null;

		try {
			session = HibernateUtil.openSession();

			// start transaction
			transaction = session.beginTransaction();
			// save Student
			foundStudent = (Student) session.get(Student.class, Student.getId());
			// commit transaction
			transaction.commit();

		} catch (HibernateException ex) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			HibernateUtil.closeSession(session);

		}
		return foundStudent;
	}

}
