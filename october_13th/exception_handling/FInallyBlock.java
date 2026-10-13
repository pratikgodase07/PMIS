package october_13th.exception_handling;

public class FInallyBlock {
	
	public static void main(String[] args) {
		
		try {
			
			int result=10/5;
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Cannot divide by 0");
		}
		
		finally {
			System.out.println("Finally Block Executed");
		}
		
	}

}
