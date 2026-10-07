/*  Write a program to print Fibonacci series of n terms where n is
input by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that
came before it.
 
*/

import java.util.*;

public class Exercise_10
    {
    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series of " + n + " terms:");

        for (int i = 1; i <= n; ++i)
             {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        sc.close();
    }
}
