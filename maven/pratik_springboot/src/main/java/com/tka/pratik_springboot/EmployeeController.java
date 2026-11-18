package com.tka.pratik_springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	//localhost:8080/getAll - HTTP End point URL

	@RequestMapping(value="getAll", method= RequestMethod.GET)
	
	public void getAllData()
	{
		System.out.println("You are in Get All method().....");
	}
	
	
	
	
	
	
	
}
