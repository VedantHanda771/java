import java.util.*;

public class A_LRC_and_VIP {
    public static long computeGCD(long a, long b) {
        if (b == 0) return a;
        return computeGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] numbers = new long[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextLong();
            }

            long totalGCD = numbers[0];
            for (int i = 1; i < n; i++) {
                totalGCD = computeGCD(totalGCD, numbers[i]);
            }

            boolean allSame = true;
            for (long num : numbers) {
                if (num != totalGCD) {
                    allSame = false;
                    break;
                }
            }

            if (allSame) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                boolean groupOneAssigned = false;
                for (long num : numbers) {
                    if (!groupOneAssigned && num != totalGCD) {
                        System.out.print("1 ");
                        groupOneAssigned = true;
                    } else {
                        System.out.print("2 ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}