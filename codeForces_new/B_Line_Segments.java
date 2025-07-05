import java.io.*;
import java.util.*;

public class B_Line_Segments {

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
        int n = in.nextInt();
        int x1 = in.nextInt(), y1= in.nextInt();
        int x2 = in.nextInt(), y2 = in.nextInt();
        
        int[] r = new int[n];
        long rs = 0;
        int rm = 0;
        for(int i= 0;i<n; i++) {
            r[i] = in.nextInt();
            rs += r[i];
            rm = Math.max(rm, r[i]);
        }

        int dx = x2 - x1;
        int dy = y2 - y1;
        long distSq = 1L * dx * dx + 1L * dy * dy;

        long rt = rs;
        long rmin;
        if(n== 0){
            rmin = 0;
        } else {
            long rRest = rs-rm;
            rmin = Math.min(0L,rRest-rm);
        }

        long rMinsq = rmin * rmin;
        long rMaxsq = rt * rt;
        if(distSq > rMaxsq && distSq <= rMaxsq){
            out.println("YES");
        } else if(distSq < rMinsq || distSq > rMaxsq) {
            out.println("NO");
        } else {
            out.println("YES");
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
