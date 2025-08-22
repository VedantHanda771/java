import java.io.*;
import java.util.*;

public class C_1_The_Cunning_Seller_easy_version {

    static long[] pw = new long[40];

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        long t = in.nextLong();
        pw[0] = 1;
        for (int i = 1; i < 40; i++) pw[i] = pw[i - 1] * 3L;
        while (t-- > 0) solve(in, out);
        out.flush();
        out.close();
    }

    static long sum(long n) {
        long res = 0;
        while (n > 0) {
            res += n % 3;
            n /= 3;
        }
        return res;
    }

    static void solve(FastReader in, PrintWriter out) {
        long n = in.nextLong();
        long s = sum(n);
        long m = (n - s) / 2;
        ArrayList<Long> c = new ArrayList<>();
        c.add(n);
        long add = 0;
        long x = 0;
        while (m > 0) {
            if (x >= c.size()) c.add(0L);
            long avail = c.get((int)x) / 3L;
            if (avail == 0) {
                x++;
                continue;
            }
            long take = Math.min(avail, m);
            add += take * pw[(int)x];
            c.set((int)x, c.get((int)x) - take * 3L);
            if (x + 1 >= c.size()) c.add(0L);
            c.set((int)(x + 1), c.get((int)(x + 1)) + take);
            m -= take;
        }
        out.println(3L * n + add);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        long nextLong() { return Long.parseLong(next()); }
    }
}
