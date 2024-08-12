import java.io.*;
import java.util.*;

public class B_Minimize_Equal_Sum_Subarrays {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // Read number of test cases
        int t = Integer.parseInt(br.readLine().trim());

        // Process each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Read n
            int n = Integer.parseInt(br.readLine().trim());
            
            // Read permutation p
            String[] tokens = br.readLine().trim().split(" ");
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(tokens[i]);
            }

            // Generate permutation q
            int[] q = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = p[(i + 1) % n];
            }

            // Append result to StringBuilder
            for (int i = 0; i < n; i++) {
                sb.append(q[i]).append(" ");
            }
            sb.append("\n");
        }

        // Output all results
        System.out.print(sb.toString());
    }
}
