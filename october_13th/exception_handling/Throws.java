package october_13th.exception_handling;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Throws {
	
	static void readFile() throws IOException
	{
		FileReader file=new FileReader("Main.java");
		System.out.println("File is opened....");
	}
	public static void main(String[] args) 
	{
		
		try {n
			readFile();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("could not find the file");
		}
		
	}
	
	

}
