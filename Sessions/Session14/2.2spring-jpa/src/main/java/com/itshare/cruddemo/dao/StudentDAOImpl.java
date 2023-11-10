package com.itshare.cruddemo.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.itshare.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

	private EntityManager entityManager;
	
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	
	
	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);
	}


	@Override
	public Student findById(int id) {
		
		return entityManager.find(Student.class,id);
	}
	

	@Override
	public List<Student>findAll() {
		
		TypedQuery<Student> query= entityManager.createQuery("From Student",Student.class);
		List<Student>allStudents=query.getResultList();
		return allStudents;
	}
	
	
	@Override
	public List<Student>findAllAsc() {
		
		TypedQuery<Student> query= entityManager.createQuery("From Student order by firstname",Student.class);
		List<Student>allStudents=query.getResultList();
		return allStudents;
	}


	@Override
	public List<Student> findbyFirstName(String firstname) {

		TypedQuery<Student> query= entityManager.createQuery("From Student where firstname=:fname",Student.class);
		query.setParameter("fname",firstname);
		List<Student>allStudents=query.getResultList();
		return allStudents;
	}


	@Override
	@Transactional
	public void update(Student student) {
		entityManager.merge(student);
		
	}


	@Override
	@Transactional
	public void delete(int id) {
		Student student= findById(id);
		entityManager.remove(student);

		
	}
	
	@Override
	@Transactional
	public void deleteAll() {
		entityManager.createQuery("Delete From Student").executeUpdate();

		
	}
	
	
}
