import java.util.*;

public class B_Penchick_and_Satay_Sticks {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean result = sticks(n, a);
            if (result == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            // System.out.println(result);
        }
    }

    public static boolean sticks(int n, int[] a) {
        // boolean rv = true;
        // int b = 0;
        // Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            // int diff= Math.abs(a[i] - a[i+1]);
            if (a[i] - (i + 1) > 1 || a[i] -i -1 <-1) {
                return false;
            }

        }

        return true;
    }
}