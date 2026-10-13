package october_13th.exception_handling;

import java.util.*;

public class Throw {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		int age=sc.nextInt();
		
		if(age<0)
		{
			throw new IllegalArgumentException
			(
					"age cannot be negative"
					);
			
			
		}
		
		System.out.println("Age: "+age);
		
	}

}
