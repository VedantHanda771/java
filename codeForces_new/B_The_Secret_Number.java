import java.io.*;
import java.util.*;

public class B_The_Secret_Number {

    static final int MOD = 1_000_000_007;
    static final long INF = Long.MAX_VALUE;
    

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        long[] divs = new long[18];
        for (int k = 1; k <= 18; k++) {
            divs[k - 1] = (long) Math.pow(10, k) + 1;
        }
        while (t-- > 0) {
            solve(in, out, divs);
        }
        out.flush();
        out.close();
    }

    static void solve(FastReader in, PrintWriter out, long[] divs) {
            long n = in.nextLong();
            List<Long> ans = new ArrayList<>();

            for (long d : divs) {
                if (n % d == 0) ans.add(n / d);
            }

            if (ans.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(ans);
                System.out.println(ans.size());
                for (int i = 0; i < ans.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(ans.get(i));
                }
                System.out.println();
            }
        }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
