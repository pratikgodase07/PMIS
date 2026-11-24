import java.util.Scanner;
public class BankApplication
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 'Name' and 'Customer id' to acess your bank account:");
		String name=sc.nextLine();
		String customerId=sc.nextLine();
		BankAccount obj1= new BankAccount(name,customerId);
		obj1.menu();
	}
}

class BankAccount
{
	double balance;
	double prevTrans;
	String customerName;
	String customerId;

	BankAccount(String customerName,String customerId)
	{
		this.customerName=customerName;
		this.customerId=customerId;
	}

	void deposit(double amount)
	{
		if(amount!=0)
		{
			balance+=amount;
			prevTrans=amount;

		}
	}

	void withdraw(double amount)
	{
		if(amount!=0 && balance>=amount)
		{
			balance-=amount;
			prevTrans=-amount;
		}
		else if(balance<amount)
		{
			System.out.println("Bank balance is Insufficient");
		}
	}
	void getPreviousTrans()
	{
		if(prevTrans>0)
		{
			System.out.println("Deposited:"+prevTrans);
		}
		else if(prevTrans<0)
		{
			System.out.println("Withdrwan:"+Math.abs(prevTrans));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}

	void menu()
	{
		char option;
		Scanner sc=new Scanner(System.in);

		System.out.println("Welcome"+customerName);
		System.out.println("Your ID:"+customerId);
		System.out.println("\n");
		System.out.println("a) Check balance");
		System.out.println("b) Deposit Amount");
		System.out.println("c) Withdraw Amount");
		System.out.println("d) Previous Transaction");
		System.out.println("e) Exit...");

		do
		{
			System.out.println("**********************************");
			System.out.println("Choose an option");
			option=sc.next().charAt(0);
			System.out.println("\n");

			switch(option)
			{
			case 'a':
				System.out.println("...............................");
				System.out.println("Balance="+balance);
				System.out.println("...............................");
				System.out.println("\n");
				break;
			case 'b':
				System.out.println("...............................");
				System.out.println("Enter an amount to deposit:");
				System.out.println("...............................");
				double amount=sc.nextDouble();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'c':
				System.out.println("...............................");
				System.out.println("Enter an amount to Withdraw:");
				System.out.println("...............................");
				double amountW=sc.nextDouble();
				withdraw(amountW);
				System.out.println("\n");
				break;
			case 'd':
				System.out.println("...............................");
				System.out.println("Previous Transaction:");
				getPreviousTrans();
				System.out.println("...............................");
				System.out.println("\n");
				break;

			case 'e':
				System.out.println("...............................");
				break;
			default:
				System.out.println("Choose a correct option to proceed");
				break;
}
}
while(option!='e');

System.out.println("Thank You for using our bank services....");
		}
	}


