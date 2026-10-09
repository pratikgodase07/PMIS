//make system where user can see bank account balance and then deposited some money and then see the balance after depositing money
package october_8th.constructor;

class BankAccount
{
    String account_holder;
    double balance;


 BankAccount(String account_holder, double balance)
 {
    this.account_holder=account_holder;
    this.balance=balance;
 }



 //method1
 void deposit(double amount)
 {
    balance+=amount;
    System.out.println("Deposited amount:"+ amount);
 }

 //method1

 void displayBalance()
 {
    System.out.println("Account holder:"+ account_holder);
    System.out.println("Account balance:"+ balance);
 }

 //method3

 void withdraw(double amount)
 {
    if(amount>balance)
    {
        System.out.println("Insufficient balance");
    }
    else
    {
        balance-=amount;
        System.out.println("Withdrawn amount:"+ amount);
    }
 }
}


public class Banking_System
 {
    public static void main(String[] args)
    {
        BankAccount ac = new BankAccount("John Doe", 10000);
        ac.displayBalance();
        ac.deposit(5000);
        ac.displayBalance();
        ac.withdraw(2000);
        ac.displayBalance();
    }
}
