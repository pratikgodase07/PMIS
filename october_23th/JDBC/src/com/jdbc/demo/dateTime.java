package com.jdbc.demo;

import java.time.LocalDate;
import java.time.Month;

public class dateTime {
	public static void main(String[] args) {
		 
		LocalDate now= LocalDate.now();
		
		System.out.println("Today's date is : "+ now);
		
		int dayOfMonth = now.getDayOfMonth();
		Month month= now.getMonth();
		int year= now.getYear();
		
		System.out.println("Day : "+ dayOfMonth);
		System.out.println("Month: "+month);
		System.out.println("Year : "+year);
		
		
		LocalDate customeDate = LocalDate.of(2026, 12, 31);
		System.out.println(customeDate);
		
		System.out.println(now);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("\nYesterday was: " + yesterday);

        LocalDate pastDate = now.minusMonths(100);

        System.out.println("100 months before was: " + pastDate);
	}
	
	

}
