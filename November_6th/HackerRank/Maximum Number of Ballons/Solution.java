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
     * Complete the 'maxNumberOfBalloons' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING text as parameter.
     */

    public static int maxNumberOfBalloons(String text) {
        // Step 1: Count occurrences of required letters
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                bCount++;
            } else if (ch == 'a') {
                aCount++;
            } else if (ch == 'l') {
                lCount++;
            } else if (ch == 'o') {
                oCount++;
            } else if (ch == 'n') {
                nCount++;
            }
        }

        // Step 2: 'l' and 'o' appear twice in the word "balloon", so divide by 2
        lCount = lCount / 2;
        oCount = oCount / 2;

        // Step 3: Find the minimum count among all required characters
        int minBalloons = bCount;
        
        if (aCount < minBalloons) {
            minBalloons = aCount;
        }
        if (lCount < minBalloons) {
            minBalloons = lCount;
        }
        if (oCount < minBalloons) {
            minBalloons = oCount;
        }
        if (nCount < minBalloons) {
            minBalloons = nCount;
        }

        // Step 4: Return the maximum number of instances we can form
        return minBalloons;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String text = bufferedReader.readLine();

        int result = Result.maxNumberOfBalloons(text);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}