package hackerrank;

import java.io.*;

public class Pattern_Generation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        
        // Loop for each row from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // 1. Print ascending numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // 2. Print descending numbers from i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}