import java.io.*;
import java.util.*;

public class C_I_Will_Definitely_Make_It {

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) h[i] = in.nextInt();

            solve(n, k, h, out);
        }

        out.flush();
        out.close();
    }

    static void solve(int n, int k, int[] h, PrintWriter out) {
        int hk = h[k - 1];
        int hmax = Arrays.stream(h).max().getAsInt();

        if (hk == hmax) {
            out.println("YES");
            return;
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int val : h) set.add(val);

        Integer curr = hk;
        while (true) {
            Integer next = set.higher(curr);
            if (next == null) break;
            if (next - curr > hk) {
                out.println("NO");
                return;
            }
            curr = next;
        }

        out.println("YES");
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
