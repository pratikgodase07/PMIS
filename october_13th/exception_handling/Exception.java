package october_13th.exception_handling;

public class Exception {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try
		{
			int result=a/b;
			System.out.println(result);
			
		}
		catch (ArithmeticException e) {
			System.out.println("you cannot divisible it by 0");
			// TODO: handle exception
		}
	}

}
