package october_14th.Synchronization;

class BankAccount {
	
    private int balance = 100;

    // The 'synchronized' keyword locks this method 
    // Only one thread can run this at a time
    public synchronized void withdraw(String threadName, int amount) 
    {
        System.out.println(threadName + " is checking the balance... Current Balance: $" + balance);
        
        if (balance >= amount) 
        {
            try { 
                // Simulating the time it takes to count cash
                Thread.sleep(1000); 
            }
            catch (InterruptedException e)
            {
            	
            }
            
            balance -= amount;
            System.out.println(threadName + " successfully withdrew $" + amount);
            System.out.println("Remaining Balance: $" + balance);
        } 
        else {
            System.out.println(threadName + " failed to withdraw. Insufficient funds!");
        }
        System.out.println("----------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Thread 1: Husband tries to withdraw $100
        Thread Claude = new Thread(() -> account.withdraw("Claude", 100));

        // Thread 2: Wife tries to withdraw $100 at the same time
        Thread ChatGpt = new Thread(() -> account.withdraw("ChatGpt", 100));

        Claude.start();
        ChatGpt.start();
    }
}
