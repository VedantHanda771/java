import java.util.*;

public class D_Right_Left_Wrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline character
        
        StringBuilder result = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the strip
            long[] a = new long[n];
            long[] prefixSum = new long[n];
            
            // Read the array a and compute the prefix sum array
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                prefixSum[i] = a[i];
                if (i != 0) {
                    prefixSum[i] += prefixSum[i - 1];
                }
            }
            scanner.nextLine(); // Consume the newline character
            
            // Read the string s
            String s = scanner.nextLine();
            
            long maxScore = 0;
            int i = 0, j = n - 1;
            
            // Traverse from both ends to find 'L' and 'R' pairs
            while (i < j) {
                // Skip indices until we find 'L' on the left
                while (i < n && s.charAt(i) != 'L') {
                    i++;
                }
                
                // Skip indices until we find 'R' on the right
                while (j >= 0 && s.charAt(j) != 'R') {
                    j--;
                }
                
                // If valid 'L' and 'R' found
                if (i < j) {
                    long segmentSum = prefixSum[j];
                    if (i != 0) {
                        segmentSum -= prefixSum[i - 1];
                    }
                    
                    // Add the segment sum to the total score
                    maxScore += segmentSum;
                    
                    // Move pointers inward
                    i++;
                    j--;
                }
            }
            
            result.append(maxScore).append("\n");
        }
        
        // Output all results at once for efficiency
        System.out.print(result);
        scanner.close();
    }
}
