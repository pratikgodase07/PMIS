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
     * Complete the 'toGoatLatin' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING sentence as parameter.
     */

   public static String toGoatLatin(String sentence) {
    String vowels = "aeiouAEIOU";
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        String word = words[i];

        if (vowels.indexOf(word.charAt(0)) == -1) {
            // Consonant: move first letter to the end
            word = word.substring(1) + word.charAt(0);
        }

        // Append "ma" and then 'a' repeated (index + 1) times
        result.append(word).append("ma");
        for (int j = 0; j <= i; j++) {
            result.append('a');
        }

        if (i < words.length - 1) {
            result.append(' ');
        }
    }

    return result.toString();
}


}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String sentence = bufferedReader.readLine();

        String result = Result.toGoatLatin(sentence);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
