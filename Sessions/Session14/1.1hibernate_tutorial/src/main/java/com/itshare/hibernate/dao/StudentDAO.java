package com.itshare.hibernate.dao;


import java.util.List;

import com.itshare.hibernate.entity.Student;



/**
 *
 * @author administratorlab
 */
public interface StudentDAO {


    public int insertStudent(Student Student);

    public int updateStudent(Student Student);

    public int deleteStudent(Student Student);

    public List<Student> selectAllStudentsUsingHQL();

    public Student selectStudent(Student Student);
    
    
    

}
