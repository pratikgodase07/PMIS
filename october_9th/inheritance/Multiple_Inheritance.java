//multiple inheritance using an interface
package october_9th.inheritance;

interface mother
{
	void message();
}

interface father
{
	void message();
}

class child implements mother,father {
	@Override

	public void message()
	{
		System.out.println("Loving both mom and dad");
	}
}	

public class Multiple_Inheritance {
	
	public static void main(String[] args) {
		child c=new child();
		c.message();
		
		mother m=new child();
		c.message();
	
		
		father f=new child();
		c.message();
	}
}


