import java.util.Scanner;

public class A_Diagonals {

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int findGCD(int[] arr, int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);
            if (result == 1)
                return 1;
        }
        return result;
    }

    static int power(int x, int y, int M) {
        if (y == 0)
            return 1;
        int p = power(x, y / 2, M) % M;
        p = (p * p) % M;
        return (y % 2 == 0) ? p : (x * p) % M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long ans = 0;

            if (k > 0) {
                k -= n;
                ans++;
            }
            n--;

            while (k > 0) {
                k -= n;
                ans++;
                if (k > 0) {
                    ans++;
                    k -= n;
                }
                n--;
            }

            System.out.println(ans);
        }
        scanner.close();
    }
}
