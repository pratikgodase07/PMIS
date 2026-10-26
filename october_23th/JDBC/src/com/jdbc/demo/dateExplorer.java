package com.jdbc.demo;
import java.time.LocalDate;
import java.time.format.*;
import java.util.*;

public class dateExplorer {
	
	public void displayMonth(LocalDate date)
	{
		System.out.println("Month: " + date.getMonth() + " (" + date.getMonthValue() + ")");
        System.out.println("Day of Week: " + date.getDayOfWeek());
	}

}
