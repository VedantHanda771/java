import java.util.Scanner;

public class C_Yarik_and_Array {

    void array() {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            int[] a = new int[(int)n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long sum = a[0];
            long mini = Math.min(a[0], 0);
            long ans = a[0];
            for (int i = 1; i < n; i++) {
                if (Math.abs(a[i] % 2) == Math.abs(a[i - 1] % 2)) {
                    mini = 0;
                    sum = 0;
                }
                sum += a[i];
                ans = Math.max(ans, sum - mini);
                mini = Math.min(mini, sum);
            }
            System.out.println(ans);
        }
        sc.close();
    }

    public static void main(String[] args) {
        new C_Yarik_and_Array().array();
    }
}
