class InvalidProductException extends Exception
{
	public InvalidProductException(String s)
	{
		super(s);
	}
}
public class Example
{
	void ProductCheck(int weight)throws InvalidProductException
	{
		if(weight<100)
		{
			throw new InvalidProductException("product is invalid");
		}
	}
	public static void main(String []args)
	{
		Example e1=new Example();

		try
		{
			e1.ProductCheck(50);
		}
		catch(InvalidProductException p1)
		{
			System.out.println(p1);
		}
		System.out.println("any other code");
	}
}