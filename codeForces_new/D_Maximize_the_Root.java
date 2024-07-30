import java.util.*;

public class D_Maximize_the_Root {

    private static long[] a;
    private static long[] dp;
    private static List<Integer>[] adj;

    // DFS function to compute the answer
    private static void dfs(int u, long[] a, long[] dp, long[] ans) {
        long mx = Long.MIN_VALUE;
        for (int c : adj[u]) {
            dfs(c, a, dp, ans);
            mx = Math.max(mx, dp[c]);
        }

        if (mx == Long.MIN_VALUE) {
            dp[u] = a[u];
        } else {
            if (a[u] >= mx) {
                dp[u] = mx;
            } else {
                dp[u] = (mx + a[u]) / 2;
            }
        }

        if (u == 0) {
            ans[0] = a[0] + mx;
        }
    }

    // Solve function to handle each test case
    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt() - 1;  // Convert 1-based index to 0-based
            adj[x].add(i + 1);  // Add child node
        }

        dp = new long[n];
        Arrays.fill(dp, Long.MIN_VALUE);
        long[] ans = new long[1];
        dfs(0, a, dp, ans);
        System.out.println(ans[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
}
