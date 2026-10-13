import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'calculateArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER length
     *  2. INTEGER width
     */

    public static int calculateArea(int length, int width) {
        
        return length * width;
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two integers from the input
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        
        // Calculate the area
        int area = length * width;
        
        // Print the result directly
        System.out.println(area);
        
        scanner.close();
    }
}