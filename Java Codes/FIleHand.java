import java.io.*;
public class Test1
{
	public static void main(String []args)
	{
		try 
		{
			FileOutputStream fout = FileOutputStream("D:\\abc.txt");
			fout.write(65);
			fout.close();

			System.out.println("Success In File Handling");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}