package october_13th.exception_handling;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) 
	{
		try {
			
			int result=10/0;
			System.out.println(result);
			
			int[] numbers= {10,20,30};
			System.out.println(numbers[5]);
			
			

		} 
		catch (ArrayIndexOutOfBoundsException  e)
		{
			// TODO: handle exception
			
			System.out.println("Invalid Array Index");
		}
		
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("Cannot divide by 0");
		}
	}

}
