import java.io.*;
import java.util.*;

public class D_From_1_to_Infinity {
    static long[][] dp = new long[20][200];
    static boolean[][] vis = new boolean[20][200];

    static long dfs(String s, int pos, int sum, boolean tight) {
        if (pos == s.length()) return sum;
        if (!tight && vis[pos][sum]) return dp[pos][sum];
        long res = 0;
        int limit = tight ? s.charAt(pos) - '0' : 9;
        for (int d = 0; d <= limit; d++) {
            res += dfs(s, pos + 1, sum + d, tight && d == limit);
        }
        if (!tight) {
            vis[pos][sum] = true;
            dp[pos][sum] = res;
        }
        return res;
    }

    static long sumOfDigits(long x) {
        if (x < 0) return 0;
        return dfs(Long.toString(x), 0, 0, true);
    }

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        while (t-- > 0) {
            long k = in.nextLong();
            long digits = 1, count = 9, start = 1;
            while (k > digits * count) {
                k -= digits * count;
                start *= 10;
                digits++;
                count *= 10;
            }
            long num = start + (k - 1) / digits;
            int idx = (int) ((k - 1) % digits);
            long upto = num - 1;
            long total = sumOfDigits(upto);
            String ns = Long.toString(num);
            for (int i = 0; i <= idx; i++) total += ns.charAt(i) - '0';
            out.println(total);
        }
        out.flush();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
