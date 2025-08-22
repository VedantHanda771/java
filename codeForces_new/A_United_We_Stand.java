import java.io.*;
import java.util.*;

public class A_United_We_Stand {

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
for (int i = 0; i < n; i++) arr[i] = in.nextInt();

ArrayList<Integer> b = new ArrayList<>();
ArrayList<Integer> c = new ArrayList<>();

for (int i = 0; i < n; i++) {
    boolean divisible = false;
    for (int j = 0; j < n; j++) {
        if (i != j && arr[j] % arr[i] == 0) {
            divisible = true;
            break;
        }
    }
    if (divisible) b.add(arr[i]);
    else c.add(arr[i]);
}

if(c.size() != 0){
    out.print(c.size() + " " + b.size());
out.println();
for (int x : c) out.print(x + " ");
out.println();
for (int x : b) out.print(x + " ");
out.println();
} else{
    out.println("-1");
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
