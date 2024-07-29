import java.util.Scanner;
import java.util.Arrays;

public class E_Coloring_Game {
    static final int N = 200010;
    static int T, n, m;
    static int[] t = new int[N], st = new int[N], ed = new int[N], len = new int[N];
    static long ans;
    static char[] s = new char[N];

    public static void solve(int k) {
        int h = m / k;
        int tmp = Integer.MAX_VALUE;

        for (int i = 1; i <= h; i++) {
            st[i] = t[(i - 1) * k + 1];
            ed[i] = t[i * k];
            len[i] = ed[i] - st[i] + 1;
        }

        for (int i = 1; i <= h; i++) {
            if (len[i] != len[1]) return;
        }

        for (int i = 2; i <= h; i++) {
            for (int j = 1; j <= len[1]; j++) {
                if (s[st[1] + j - 1] != s[st[i] + j - 1]) return;
            }
        }

        for (int i = 2; i <= h; i++) {
            tmp = Math.min(tmp, st[i] - ed[i - 1] - 1);
        }

        int L = st[1] - 1;
        int R = n - ed[h];

        for (int i = 0; i <= L; i++) {
            ans += Math.max(0, Math.min(tmp - i + 1, R + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        while (T-- > 0) {
            s = (" " + scanner.nextLine()).toCharArray(); // add a space to make it 1-based index
            n = s.length - 1;
            m = 0;

            for (int i = 1; i <= n; i++) {
                if (s[i] != 'a') {
                    t[++m] = i;
                }
            }

            if (m == 0) {
                System.out.println(n - 1);
                continue;
            }

            ans = 0;

            for (int i = 1; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    solve(i);
                    if (m / i != i) {
                        solve(m / i);
                    }
                }
            }

            System.out.println(ans);
        }

        scanner.close();
    }
}
