import java.io.*;
import java.util.*;

public class F_Wildflower {
    static final int MOD = 1_000_000_007;

    // Fast exponentiation modulo MOD
    static long modexp(long a, long e) {
        long res = 1;
        while (e > 0) {
            if ((e & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            e >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader for fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer>[] g = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                g[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {
                String[] parts = br.readLine().split(" ");
                int u = Integer.parseInt(parts[0]);
                int v = Integer.parseInt(parts[1]);
                g[u].add(v);
                g[v].add(u);
            }

            // Build rooted tree at 1
            int[] parent = new int[n + 1];
            ArrayList<Integer>[] children = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                children[i] = new ArrayList<>();
            }
            parent[1] = -1;

            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            ArrayList<Integer> order = new ArrayList<>();

            while (!stack.isEmpty()) {
                int u = stack.pop();
                order.add(u);
                for (int w : g[u]) {
                    if (parent[w] == 0) {
                        parent[w] = u;
                        children[u].add(w);
                        stack.push(w);
                    }
                }
            }

            // Compute subtree sizes bottom-up
            int[] size = new int[n + 1];
            Arrays.fill(size, 1);
            for (int i = order.size() - 1; i >= 0; i--) {
                int u = order.get(i);
                for (int w : children[u]) {
                    size[u] += size[w];
                }
            }

            boolean ok = true;
            for (int u = 1; u <= n; u++) {
                int csize = children[u].size();
                if (csize >= 3) {
                    ok = false;
                    break;
                }
                if (csize == 2) {
                    int c0 = children[u].get(0);
                    int c1 = children[u].get(1);
                    if (size[c0] != size[c1]) {
                        ok = false;
                        break;
                    }
                }
            }

            if (!ok) {
                sb.append("0\n");
            } else {
                sb.append(modexp(2, n)).append("\n");
            }
        }

        System.out.print(sb);
    }
}
