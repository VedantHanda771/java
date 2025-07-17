import java.io.*;
import java.util.*;

public class G_2_Big_Wins_hard_version {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();

            Arrays.sort(a);
            int maxDiff = 0;
            for (int i = 1; i < n; i++) {
                maxDiff = Math.max(maxDiff, a[i] - a[0]);
            }

            out.println(maxDiff);
        }

        out.flush();
        out.close();
    }

    // Fast input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens())
                try { st = new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
    }
}
