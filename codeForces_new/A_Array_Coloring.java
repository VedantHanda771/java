import java.io.*;
import java.util.*;

public class A_Array_Coloring {

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
        long[] arr = new long[(int)n];
        for(int i = 0;i<n;i++) arr[i] = in.nextLong();
        long s1 = 0;
        long s2 = 0;
        int i=0, j = (int)n-1;
        while(i<=j){
            s1 += arr[i];
            s2 += arr[j];
            i++;
            j--;
            if(j==i){s1 +=arr[i]; break;}
        }
        if((s1%2 == 0 && s2%2==0)|| (s1%2 == 1 && s2%2==1) || s1 == s2) out.println("YES");
        else out.println("NO");
        
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
