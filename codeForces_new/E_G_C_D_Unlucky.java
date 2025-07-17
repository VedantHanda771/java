import java.io.*;
import java.util.*;

public class E_G_C_D_Unlucky {

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
        int n = in.nextInt();
        long[] p = new long[n];
        long[] s = new long[n];

        for (int i = 0; i < n; i++) p[i] = in.nextLong();
        for (int i = 0; i < n; i++) s[i] = in.nextLong();

        long g = p[n - 1];
        boolean isValid = true;

        if (s[0] != g) isValid = false;

        for (int i = 0; i < n; i++) {
            if (p[i] % g != 0 || s[i] % g != 0) {
                isValid = false;
                break;
            }
            if (gcd(p[i], s[i]) != g) {
                isValid = false;
                break;
            }
        }

        for (int i = 0; i + 1 < n; i++) {
            if (gcd(p[i], s[i + 1]) != g) {
                isValid = false;
                break;
            }
        }

        out.println(isValid ? "YES" : "NO");
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
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
    }
}
