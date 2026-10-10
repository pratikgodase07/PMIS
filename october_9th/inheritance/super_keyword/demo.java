package october_9th.inheritance.super_keyword;
//
//class Employee
//{
//	double salary=15000;
//}
//
//class Manager extends Employee
//{
//	double salary=60000;
//	
//	void displaySalary()
//	{
//		System.out.println("Manager Salary: " + salary);
//		
//		System.out.println("Employee Salary: " + super.salary);
//	}
//}











//class Animal
//{
//	void eat()
//	{
//		System.out.println("Animal is eating");
//	}
//}
//
//class Dog extends Animal
//{
//	void eat()
//	{
//		System.out.println("Dog is barking");
//		super.eat();
//	}
//	
//}



//bank account example
class BankAccount
{
	String Accountholder;
	
	BankAccount(String Accountholder)
	{
		this.Accountholder=Accountholder;
	}
	
	void displayDetails()
	{
		System.out.println("Account holder: "+Accountholder );
	}
}

class SavingsAccount extends BankAccount
{
	double interestrate=4.5;
	
	SavingsAccount(String Accountholder)
	{
		super(Accountholder);
	}
	
	@Override
	void displayDetails()
	{
		System.out.println("Account holder name is: "+Accountholder);
		System.out.println("Interest rate: "+interestrate + " %");
	}
}












