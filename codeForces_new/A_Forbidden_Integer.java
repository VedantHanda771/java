import java.io.*;
import java.util.*;

public class A_Forbidden_Integer {

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
        long m = in.nextLong();
        long x = in.nextLong();
        if(x != 1){
            out.println("YES");
            out.println(n);
            for(int i = 0;i<n;i++){
                out.print(1 + " ");
            }
            out.println();
        }else 
        {
            if(m ==1 || (m==2 && n%2==1)){
                out.println("NO");
            } else {
                out.println("YES");
                if(n%2 ==0){
                    out.println(n/2);
                    for(int i = 0;i<n/2;i++){
                        out.print(2 + " ");
                    }
                    out.println();
                }else{
                    out.println((n-3)/2 + 1);
                    for(int i = 0;i<(n-3)/2;i++){
                        out.print(2 + " ");
                    }
                    out.print(3);
                    out.println();
                }
            }
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
