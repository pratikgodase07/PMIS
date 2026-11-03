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
     * Complete the 'nthSuperUglyNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY primes
     */

   public static int nthSuperUglyNumber(int n, List<Integer> primes)
   {
    int k=primes.size();

    int[] ugly= new int[n];
    int[] index= new int[k];
    int[] next= new int[k];
    
    
    ugly[0]=1;
    
    for(int i=0; i<k; i++)
    {
        next[i] = primes.get(i);
    }
    
    for(int i=1; i<n; i++)
    {
        int min= next[0];
        
        for(int j=1; j<k; j++)
        {
            if(next[j]< min)
            {
                min= next[j];
            }
        }
        
        ugly[i]= min;
        
        
        for(int j=0; j<k; j++)
        {
            if(next[j]==min)
            {
                index[j]++;
                
                next[j]= ugly[index[j]] * primes.get(j);
            }
        }
    }
    
    return ugly[n-1];
   }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int primesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> primes = IntStream.range(0, primesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.nthSuperUglyNumber(n, primes);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
