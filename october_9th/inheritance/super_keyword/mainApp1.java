package october_9th.inheritance.super_keyword;

//import october_9th.inheritance.super_keyword.Animal.Dog;

public class mainApp1 {
	public static void main(String []args)
	{
		
	Dog doggy = new Dog();
	doggy.name="Tommy";
	
	
	System.out.println("Dog name: "+ doggy.name);
	doggy.bark();
	doggy.eat();

	}
}
