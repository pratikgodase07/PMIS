package com.tka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.demo.entity.Student;
import com.tka.demo.studentdao.StudentDao;

@Service
public class StudentService {

	
	@Autowired
	StudentDao dao;
	
	
	public void insertStudentRecord(Student student)
	{
		dao.insertStudentRecord(student);
	}
	
	
	
}
