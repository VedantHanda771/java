import java.util.*;

public class A_Olesya_and_Rodion {

    public static String int2(int n, int m) {
        // Special case when m is 10
        if (m == 10) {
            if (n == 1) {
                return "-1"; // No valid 1-digit number divisible by 10
            } else {
                // For numbers divisible by 10 and n > 1, the number must be '1' followed by
                // (n-1) zeros
                StringBuilder sb = new StringBuilder();
                sb.append(1); // First digit is 1
                for (int i = 1; i < n; i++) {
                    sb.append(0); // Remaining (n-1) digits are 0
                }
                return sb.toString();
            }
        }
        // For any other m, we simply create a number that starts with m and has (n-1)
        // trailing zeros
        StringBuilder sb = new StringBuilder();
        sb.append(m);
        for (int i = 1; i < n; i++) {
            sb.append(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of digits
        int m = sc.nextInt(); // Read the divisor
        String result = int2(n, m); // Get the result
        System.out.println(result); // Output the result
        sc.close();
    }
}
