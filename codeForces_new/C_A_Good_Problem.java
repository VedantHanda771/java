import java.io.*;
import java.util.*;

public class C_A_Good_Problem {

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
        Long n = in.nextLong();
        long l = in.nextLong();
        long r = in.nextLong();
        long k = in.nextLong();

        if(n == 1){
            out.println(l);
        }
        else if(n %2 == 1){
            if(k<= n) out.println(l);
            else out.println(-1);
        } else if(n == 2) out.println(-1);
        else {long x = l;
            while(true){
                boolean is = true;
                for(int i = 0;i<64;i++){
                    long bit = 1L << i;
                    if((l&bit) != 0 && (x&bit)!=0){
                        x +=bit;
                        x &= ~(bit - 1);
                        is = false;
                        break;
                    }
                }
                if(is) break;
            }
            if (x > r) {
                out.println(-1);
                return;
            }
            if (k <= n - 2) {
                out.println(l);
                return;
            }
            out.println(x);

            
        }

        // out.println(-1);
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
