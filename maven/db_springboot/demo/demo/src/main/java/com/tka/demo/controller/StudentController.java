package com.tka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.demo.entity.Student;
import com.tka.demo.service.StudentService;

@RestController
@RequestMapping(value= "StudentAPI")
public class StudentController {

	@Autowired
	StudentService service;
	
	
	
	//localhost:8080/studentAPI/addStudentData
	
	@PostMapping(value= "addStudentData")
	public String insertStudentsData(@RequestBody Student student)
	{
		String str=service.insertStudentRecord2(student);
		return str;
	
	}
}