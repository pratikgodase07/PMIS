// Takes two numbers and returns the greater one.

import java.util.*;

public class Exercise_3 
{
    public static double greaterNumber(double num1, double num2)
     {
        return Math.max(num1, num2);
        }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("The greater number is: " + greaterNumber(num1, num2));
        
    }
}
}

   

