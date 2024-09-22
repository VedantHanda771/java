import java.util.*;

public class E_Photoshoot_for_Gorillas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long k = sc.nextLong();
            int w = sc.nextInt();
            long[] a = new long[w];

            for (int i = 0; i < w; i++) {
                a[i] = sc.nextLong();
            }

            List<Long> ans = new ArrayList<>();

            for (long i = 0; i < n; i++) {
                for (long j = 0; j < m; j++) {
                    ans.add((k - Math.max(k - i - 1, 0)) * (k - Math.max(k - j - 1, 0)) * (k - Math.max(k - (n - i), 0)) * (k - Math.max(k - (m - j), 0)));
                }
            }

            Collections.sort(ans, Collections.reverseOrder());
            Arrays.sort(a);

            long res = 0;
            for (int i = 0; i < w; i++) {
                res += ans.get(i) * a[w - 1 - i];
            }

            System.out.println(res);
        }
        sc.close();
    }
}
