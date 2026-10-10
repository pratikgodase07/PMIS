//multilevel inheritance example

package october_9th.inheritance;


//parent class
class Device
{
	void poweron()
	{
		System.out.println("Device is powered on....");
	}
	
}

//child class 1
class dabbaPhone extends Device
{
	void makecall()
	{
		System.out.println("Calling the number....");
	}
}


//child class 2
class smartphone extends dabbaPhone

{
	void browsing()
	{
		System.out.println("Opening the Browser");
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) 
	{
		smartphone samsung=new smartphone();
		
		dabbaPhone nokia=new dabbaPhone();
		
		samsung.makecall();
		samsung.browsing();
		samsung.poweron();
		
		System.out.println();
		
		nokia.makecall();
		nokia.poweron();
		
	
	
	}
}
