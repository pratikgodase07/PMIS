//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another

import java.util.Scanner;
public class Exercise_8
 {
    public static long power(int x, int n)
     {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        long result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
 
    
}
