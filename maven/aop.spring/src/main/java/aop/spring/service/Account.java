package aop.spring.service;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private double balance;

	public Account() {
		super();
		this.balance=0.0;
		
	}
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
public void withdrawBalance(double amount) {
	//this.balance = this.balance+amount;
	System.out.println("amount withdraw");
}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	  
	
	
	
}
