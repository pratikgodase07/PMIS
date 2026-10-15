package october_15th.Generics.MultiTypeParameters;

import java.util.*;
class Util
{
	static <T> void printTwice( T value)
	{
		System.out.println(value);
		System.out.println(value);
	}

		static <T> T firstOf( T a,  T b)
		{
			return b;
		}
		}

public class Gen1
{
	public static void main(String[] args) {
		Util.printTwice(100);
		System.out.println(Util.firstOf("Hii", "Helloo"));
	}
}


