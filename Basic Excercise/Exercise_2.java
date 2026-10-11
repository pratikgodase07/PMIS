//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class Exercise_2 {

    public static long sumOfOddNumbers(int n)
     {
        long sum = 0;
        for (int i = 1; i <= n; i += 2)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long sum = sumOfOddNumbers(n);
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
    }
    
}
    

