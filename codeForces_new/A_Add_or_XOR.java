import java.io.*;
import java.util.*;

public class A_Add_or_XOR {

    static final int MOD = 1_000_000_007;
    static final long INF = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt(); // number of test cases
        while (t-- > 0) {
            solve(in, out);
        }

        out.flush();
        out.close();
    }

    static void solve(FastReader in, PrintWriter out) {
        // Example input
        int a = in.nextInt();
        int b = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        if (a == b) {
            out.println(0);
            return;
        }

        Map<Integer, Long> dist = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(p -> p.cost));

        dist.put(a, 0L);
        pq.add(new Pair(a, 0L));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int curr = current.value;
            long currCost = current.cost;

            if (curr == b) {
                out.println(currCost);
                return;
            }

            if (currCost > dist.get(curr)) continue;

            // Operation 1: a + 1
            int next = curr + 1;
            if (next <= 200) {
                long newCost = currCost + x;
                if (!dist.containsKey(next) || newCost < dist.get(next)) {
                    dist.put(next, newCost);
                    pq.add(new Pair(next, newCost));
                }
            }

            // Operation 2: a ^ 1
            next = curr ^ 1;
            long newCost = currCost + y;
            if (!dist.containsKey(next) || newCost < dist.get(next)) {
                dist.put(next, newCost);
                pq.add(new Pair(next, newCost));
            }
        }

        out.println(-1);
    }

    // Pair class for PriorityQueue
    static class Pair {
        int value;
        long cost;
        Pair(int value, long cost) {
            this.value = value;
            this.cost = cost;
        }
    }

    // FastReader for fast input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens())
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
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
