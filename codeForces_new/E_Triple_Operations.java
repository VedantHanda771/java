import java.util.Scanner;
import java.util.Arrays;

public class E_Triple_Operations {
    static final int N = 200001; // 2 * 10^5 + 1
    static int[] dp = new int[N + 1];
    static long[] prefixSum = new long[N + 1]; // Prefix sums for fast range queries

    static int solve(int i) {
        if (i == 0) return 0;
        if (dp[i] != -1) return dp[i];
        dp[i] = 1 + solve(i / 3);
        return dp[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize dp array with -1
        Arrays.fill(dp, -1);

        // Compute dp values for all indices
        for (int i = N - 1; i >= 0; --i) {
            solve(i);
        }

        // Compute prefix sums for fast range queries
        prefixSum[0] = dp[0];
        for (int i = 1; i <= N; ++i) {
            prefixSum[i] = prefixSum[i - 1] + dp[i];
        }

        int t = scanner.nextInt();
        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            
            // Calculate the result using prefix sums
            long ans = dp[l] * 2;
            if (l > 0) {
                ans += prefixSum[r] - prefixSum[l - 1];
            } else {
                ans += prefixSum[r];
            }
            System.out.println(ans);
        }

        scanner.close();
    }
}
