//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class Exercise_1 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("The average is: " + average);       

     }
     
    }
