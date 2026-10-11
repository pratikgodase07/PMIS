//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class Exercise_4
{
    public static double calculateCircumference(double radius)
     {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        
        double radius=sc.nextDouble();
        

        double circumference=calculateCircumference(radius);
        System.out.println("The circumference of the circle is: " + circumference);
        

    }
}