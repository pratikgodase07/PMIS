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
     * Complete the 'hasGroupsSizeX' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts INTEGER_ARRAY deck as parameter.
     */

    public static boolean hasGroupsSizeX(List<Integer> deck) {
        // Step 1: Sort the deck so identical cards are grouped together
        Collections.sort(deck);
        
        List<Integer> counts = new ArrayList<>();
        int currentCount = 1;
        
        // Step 2: Count how many times each unique card appears
        for (int i = 1; i < deck.size(); i++) {
            if (deck.get(i).equals(deck.get(i - 1))) {
                currentCount++;
            } else {
                counts.add(currentCount);
                currentCount = 1;
            }
        }
        counts.add(currentCount); // Add the count for the last group
        
        // Step 3: Find the smallest count to check possible group sizes (X >= 2)
        int minCount = counts.get(0);
        for (int c : counts) {
            if (c < minCount) {
                minCount = c;
            }
        }
        
        // Step 4: Try every possible group size X from 2 up to minCount
        for (int x = 2; x <= minCount; x++) {
            boolean valid = true;
            for (int c : counts) {
                // If any card count is not evenly divisible by X, this X fails
                if (c % x != 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                return true; // Found a valid group size X!
            }
        }
        
        return false;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int deckCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> deck = IntStream.range(0, deckCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        boolean result = Result.hasGroupsSizeX(deck);

        bufferedWriter.write(String.valueOf(result ? 1 : 0));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}