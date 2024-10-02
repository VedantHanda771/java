import java.util.Scanner;

public class prime2 {
    public static int int1(int value) {
        // Prime factorization logic
        for (int div = 2; div * div <= value; div++) {
            while (value % div == 0) {
                value /= div;
                System.out.print(div + " ");
            }
        }
        if (value != 1) {
            System.out.print(value);  // Print remaining prime factor if any
        }
        return value;  // Return the remaining value (useful if needed later)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of inputs

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();  // Input number to factorize
            int1(m);
            System.out.println();  // Print newline after each factorization
        }

        sc.close();  // Close the scanner to avoid resource leak
    }
}
