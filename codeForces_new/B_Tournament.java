import java.util.*;

public class B_Tournament {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        StringBuilder res = new StringBuilder();

        while (tests-- > 0) {
            int n = in.nextInt();
            int idx = in.nextInt() - 1;
            int k = in.nextInt();

            int[] strength = new int[n];
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                strength[i] = in.nextInt();
                maxVal = Math.max(maxVal, strength[i]);
            }

            if (k > 1) {
                res.append("YES\n");
            } else {
                res.append((strength[idx] == maxVal) ? "YES\n" : "NO\n");
            }
        }

        System.out.print(res);
    }
}
