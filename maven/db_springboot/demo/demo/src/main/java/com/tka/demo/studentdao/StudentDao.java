package com.tka.demo.studentdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tka.demo.entity.Student;

public class StudentDao {
	
	
	
	@Autowired
	SessionFactory factory;
	
	
	public void insertStudentRecord(Student student)
	{
		Session session = factory.openSession();
		session.beginTransaction();
		session.persist(student);
		session.getTransaction().commit();
		session.close();
		
		
	}
	public String insertStudentRecord2(Student student)
	{
		Session session = factory.openSession();
		session.beginTransaction();
		session.persist(student);
		session.getTransaction().commit();
		session.close();
		
		return "Student data inserted.....";
	}

}
