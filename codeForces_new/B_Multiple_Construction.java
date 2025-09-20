import java.io.*;
import java.util.*;

public class B_Multiple_Construction {

    static final int MOD = 1_000_000_007;
    static final long INF = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        while (t-- > 0) {
            solve(in, out);
        }
        out.flush();
        out.close();
    }

    static void solve(FastReader in, PrintWriter out) {
        long n = in.nextLong();
            long m = 2 * n;

            ArrayList<Long> a = new ArrayList<>(Collections.nCopies((int) (m + 1), 0L));
            ArrayList<Boolean> used = new ArrayList<>(Collections.nCopies((int) (m + 1), false));

            long cur = 1;
            for (long l = n; l >= 1; --l) {
                while (cur <= m && used.get((int) cur)) cur++;
                long i = cur;
                long j = i + l;
                while (j <= m && used.get((int) j)) j += l;

                a.set((int) i, l);
                a.set((int) j, l);
                used.set((int) i, true);
                used.set((int) j, true);
            }

            StringBuilder sb = new StringBuilder();
            for (long i = 1; i <= m; ++i) {
                if (i > 1) sb.append(' ');
                sb.append(a.get((int) i));
            }
            System.out.println(sb);
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
