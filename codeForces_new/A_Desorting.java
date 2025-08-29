import java.io.*;
import java.util.*;

public class A_Desorting {

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
        // Problem-solving logic goes here
        long n = in.nextLong();
        long[] a = new long[(int)n];
        for(int i = 0;i<n;i++){
            a[i] = in.nextLong();
        }

        long rv = Integer.MAX_VALUE;
        for(int i = 0;i<n-1;i++){
            if(a[i]<=a[i+1]){
                long d = a[i+1] - a[i];
                long req = (d/2)+1;
                rv = Math.min(rv,req);
            }else {
                rv = 0;
            }
        }
        out.println(rv);

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
