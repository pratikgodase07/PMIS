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
     * Complete the 'largeGroupPositions' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts STRING s as parameter.
     */

    public static List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> result = new ArrayList<>();
    int n = s.length();
    int start = 0;

    for (int i = 1; i <= n; i++) {
        // Group ends when we reach the end of the string or the character changes
        if (i == n || s.charAt(i) != s.charAt(start)) {
            if (i - start >= 3) {
                result.add(Arrays.asList(start, i - 1));
            }
            start = i;
        }
    }

    return result;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        List<List<Integer>> result = Result.largeGroupPositions(s);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
