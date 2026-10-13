package october_13th.exception_handling;

import java.util.*;
public class Exercise_1 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a =sc.nextInt();
		
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		
	
		
		
		try {
			
			int result=a/b;
			System.out.println("Result is: "+result);
			
		} 
		catch (ArithmeticException e)
		{
			
			System.out.println("Error: You cannot divisible by 0");
			// TODO: handle exception
		}
		finally {
			System.out.println("Program Executed...");
		}
	}

}
