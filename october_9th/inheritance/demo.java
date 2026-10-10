package october_9th.inheritance;


class Animal
{
	void eat()
	{
		System.out.println("The animal eats the food");
	}
}
	
	class Dog extends Animal
	{
	
	void bark()
	{
		System.out.println("The dog barks loudly");
	}
}


	public class demo
	{	
	
	public static void main(String[]args)
	{
		Dog myDog= new Dog();
		
		myDog.eat();
//		myDog.bark();
	}
	
	
	}

