import java.io.*;
import java.util.*;

public class B_Sequence_Game {

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
        
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++) arr[i] = in.nextInt();
            ArrayList<Integer> ls = new ArrayList<>();
            ls.add(arr[0]);
            for(int i= 1;i<n;i++){
                if(arr[i]>= arr[i-1]) {ls.add(arr[i]);}
                else {ls.add(arr[i]); ls.add(arr[i]);}
            }
            out.println(ls.size());
            for(int i:ls) out.print(i + " ");
            out.println();
        
        
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
