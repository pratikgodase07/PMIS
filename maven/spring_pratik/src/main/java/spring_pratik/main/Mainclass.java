package spring_pratik.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_pratik.entity.Employee;
import spring_pratik.entity.Nation;

public class Mainclass {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring_config.xml");
		
		Employee emp1= context.getBean("emp",Employee.class);
		System.out.println(emp1);
		
		Employee emp2=context.getBean("emp", Employee.class);
		System.out.println(emp2);
		
		
		Nation nation= context.getBean("nation", Nation.class);

		System.out.println(nation);
	
	
	}

}
