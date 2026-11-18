package aop.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aop.spring.configure.Spring_Configure;
import aop.spring.service.Account;

public class MainClass {
	public static void main(String[] args) {
			ApplicationContext context=new AnnotationConfigApplicationContext(Spring_Configure.class);
			
			Account ac=context.getBean(Account.class);
			System.out.println("Line 1");
			
	}

}
