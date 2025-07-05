import java.util.*;

public class C_Cool_Partition {

    public static int maxCoolSegments(int[] a) {
        int n = a.length;

        // Step 1: Compute the next occurrence of each element
        int[] nxt = new int[n];
        Map<Integer, Integer> lastPos = new HashMap<>();
        Arrays.fill(nxt, n);

        for (int i = n - 1; i >= 0; i--) {
            if (lastPos.containsKey(a[i])) {
                nxt[i] = lastPos.get(a[i]);
            }
            lastPos.put(a[i], i);
        }

        // Step 2: Greedily cut segments
        int ans = 0;
        int l = 0;

        while (l < n) {
            int furthest = -1;
            int lastGood = -1;
            int i = l;

            while (i < n && furthest < n) {
                furthest = Math.max(furthest, nxt[i]);
                if (furthest < n) {
                    lastGood = i;
                }
                i++;
            }

            if (lastGood < 0) {
                ans++;
                break;
            } else {
                ans++;
                l = lastGood + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sb.append(maxCoolSegments(a)).append("\n");
        }

        System.out.print(sb);
        sc.close();
    }
}
