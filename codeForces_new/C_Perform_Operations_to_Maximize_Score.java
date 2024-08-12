import java.io.*;
import java.util.*;

public class C_Perform_Operations_to_Maximize_Score {

    // Function to handle each test case
    private static void solve(BufferedReader br, PrintWriter pw) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numPairs = Integer.parseInt(st.nextToken());
        int offset = Integer.parseInt(st.nextToken());
        
        // Read pairs
        int[][] pairs = new int[numPairs][2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numPairs; i++) {
            pairs[i][0] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numPairs; i++) {
            pairs[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // Sort pairs based on the first element
        Arrays.sort(pairs, Comparator.comparingInt(p -> p[0]));
 
        int medianIndex = (numPairs - 1) / 2;
        long maxSum = Long.MIN_VALUE;
        
        for (int i = 0; i < numPairs; ++i) {
            if (pairs[i][1] == 1) {
                // Ensure medianIndex is valid
                if (medianIndex < numPairs) {
                    maxSum = Math.max(maxSum, (long) pairs[i][0] + offset + pairs[medianIndex][0]);
                }
            } else {
                // Ensure medianIndex - 1 is valid
                if (medianIndex - 1 >= 0) {
                    maxSum = Math.max(maxSum, (long) pairs[i][0] + pairs[medianIndex - 1][0]);
                }
            }
        }
        
        pw.println(maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int testCases = Integer.parseInt(br.readLine().trim());
        while (testCases-- > 0) {
            solve(br, pw);
        }
        
        pw.flush(); // Ensure all output is written
        pw.close();
    }
}
