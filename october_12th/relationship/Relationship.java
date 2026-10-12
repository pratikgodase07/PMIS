package october_10th.relationship;


//HAS-A Relationship
//class Engine
//{
//	void start()
//	{
//		System.out.println("Engine is starting....");
//	}
//	
//}
//
//class Car 
//{
//	private Engine engine;
//	
//	Car()
//	{
//		this.engine= new Engine();
//	}
//	
//	void drive()
//	{
//		engine.start();
//		
//		System.out.println("Car is moving");
//	}
//}



//2nd example
//class Address
//{
//	String city;
//	String state;
//	int pincode;
//	
//	
//	Address(String city, String state, int pincode)
//	{
//		this.city=city;
//		this.state=state;
//		this.pincode=pincode;
//	}
//	
//	void displayAddress()
//	{
//		System.out.println(city+ " "+state + " " + pincode);
//	}
//	
//}
//
//class Student
//{
//	String name;
//	int rollNumber;
//	Address address;
//	
//	
//	Student(String name, int rollNumber, Address address)
//	{
//		this.name=name;
//		this.rollNumber=rollNumber;
//		this.address=address;
//	}
//	
//	void displayProfile()
//	{
//		System.out.println("Student: "+name+ "\nrollNumber"+rollNumber);
//		
//		System.out.println("Lives at: ");
//		address.displayAddress();
//	}
//}



//3rd example of phone

//class Battery
//{
//	int capacityMAh;
//	
//	Battery(int capacityMAh)
//	{
//		this.capacityMAh=capacityMAh;
//	}
//	
//	void drain()
//	{
//		System.out.println("Battery used    Capacity remaining: "+ (capacityMAh -100)+"Mah");
//	}
//	
//}
//
//
//	
//class Camera	
//{
//	int pixel;
//	
//	Camera(int pixel)
//	{
//		this.pixel=pixel;
//	}
//	
//	void takePhoto()
//	{
//		System.out.println("Click....captured photo with "+ pixel + "Sensor");
//	}
//	
//}
//
//
//class Phone
//{
//	String brand;
//	Battery battery;
//	Camera camera;
//	
//	
//	Phone(String brand,Battery battery, Camera camera)
//	{
//		this.brand=brand;
//		this.battery=battery;
//		this.camera=camera;
//		
//		
//		
//	}
//	
//	void snapPicture()
//	{
//		System.out.println(" [ "+brand+ " ] "+ " is active ");
//		camera.takePhoto();
//		battery.drain();
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//}



//4th example 

class Student
{
	String name;
	static String collegeName="IIT Bombay";
	
	Student(String name)
	{
		this.name=name;
	}
	
	
	void studcol()
	{
		System.out.println(name+ "Studies in "+collegeName);
	}
}