import java.io.*;
import java.util.*;

public class E_Lost_Soul {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int[] b = new int[n];

            String[] parts = br.readLine().split(" ");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(parts[i]);
            parts = br.readLine().split(" ");
            for (int i = 0; i < n; i++) b[i] = Integer.parseInt(parts[i]);

            // f[i] = length of longest segment starting at i where we can make matches by operations
            int[] f = new int[n];
            f[n - 1] = (a[n - 1] == b[n - 1]) ? 1 : 1;

            for (int i = n - 2; i >= 0; i--) {
                if (a[i] == b[i]) {
                    f[i] = 1 + f[i + 1];
                } else if (a[i] == b[i + 1] && b[i] == a[i + 1]) {
                    // special case: we can swap next elements to match both arrays
                    f[i] = 2 + (i + 2 < n ? f[i + 2] : 0);
                } else {
                    f[i] = 1;
                }
            }

            // prefix max length of f from left to right
            int[] prefixMax = new int[n + 1];
            prefixMax[0] = 0;
            for (int i = 0; i < n; i++) {
                prefixMax[i + 1] = Math.max(prefixMax[i], f[i]);
            }

            // suffix max length of f from right to left
            int[] suffixMax = new int[n + 2];
            suffixMax[n + 1] = 0;
            suffixMax[n] = 0;
            for (int i = n - 1; i >= 0; i--) {
                suffixMax[i] = Math.max(suffixMax[i + 1], f[i]);
            }

            int ans = prefixMax[n]; // No removal case

            // Try removing index i
            for (int i = 0; i < n; i++) {
                // Max matches = max prefix before i + max suffix after i
                ans = Math.max(ans, prefixMax[i] + suffixMax[i + 1]);
            }

            out.append(ans).append("\n");
        }

        System.out.print(out);
    }
}
