package october_14th.MultiThreading;

public class MultiThreading extends Thread
{
	 	public void run()
	 	{
	 		System.out.println("Thread is running....");
	 	}
	 	
	 	public static void main(String[] args) {
			MultiThreading obj=new  MultiThreading();
			obj.start();
		}

}
