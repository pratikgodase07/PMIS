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
     * Complete the 'calculateFinalSpeed' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER initialSpeed
     *  2. INTEGER acceleration
     *  3. INTEGER braking
     */

    public static int calculateFinalSpeed(int initialSpeed, int acceleration, int braking)
     {
        return initialSpeed + acceleration - braking;
    
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int initialSpeed = Integer.parseInt(bufferedReader.readLine().trim());

        int acceleration = Integer.parseInt(bufferedReader.readLine().trim());

        int braking = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.calculateFinalSpeed(initialSpeed, acceleration, braking);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
