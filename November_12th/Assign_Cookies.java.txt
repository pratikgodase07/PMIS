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
     * Complete the 'findContentChildren' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY g
     *  2. INTEGER_ARRAY s
     */

    public static int findContentChildren(List<Integer> g, List<Integer> s) {
        List<Integer> greed = new ArrayList<>(g);
        List<Integer> cookies = new ArrayList<>(s);
        Collections.sort(greed);
        Collections.sort(cookies);

        int child = 0;
        int cookie = 0;

        while (child < greed.size() && cookie < cookies.size()) {
            if (cookies.get(cookie) >= greed.get(child)) {
                child++;   // this child is content, move to the next child
            }
            cookie++;      // this cookie is used, or too small for everyone left
        }

        return child;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> g = IntStream.range(0, gCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int sCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = IntStream.range(0, sCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.findContentChildren(g, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
