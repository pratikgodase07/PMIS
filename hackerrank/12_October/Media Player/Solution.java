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
     * Complete the 'playMedia' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING mediaType and STRING title as parameters.
     */

    public static String playMedia(String mediaType, String title) {
        if (mediaType.equals("Song")) {
            return "Playing song: " + title;
        } else if (mediaType.equals("Video")) {
            return "Playing video: " + title;
        } else if (mediaType.equals("Podcast")) {
            return "Playing podcast: " + title;
        } else {
            return "Unknown media type";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read the first line for the media type
        String mediaType = bufferedReader.readLine();
        
        // Read the second line for the title
        String title = bufferedReader.readLine();

        // Pass both mediaType and title to the method
        String result = Result.playMedia(mediaType, title);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}