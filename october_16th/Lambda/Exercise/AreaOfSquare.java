package october_16th.Lambda.Exercise;

import java.util.Scanner;
import java.util.function.Function;

public class AreaOfSquare
{
    public static void main(String[] args) 
    {
        // Built-in Function interface: takes side length as input and returns the area
        Function<Double, Double> calculateArea = side -> side * side;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        
        double side = scanner.nextDouble();
        double area = calculateArea.apply(side);

        System.out.println("The area of the square with side " + side + " is: " + area);

        scanner.close();
    }
}