import java.util.*;

public class practice {

    void digit_add() {
        Scanner sc = new Scanner(System.in);
        // Read all inputs
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ans = 0, m = 1;

            while (n > 0) {
                int digit = n % 10;
                digit = (digit + 1) % 10; // Add 1 to each digit and wrap around 9 to 0
                ans = (digit * m) + ans;
                m *= 10;
                n /= 10;
            }

            System.out.println(ans); // Print the result for each number
        }
    }

    void mk_number() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of test cases
        while (n-- > 0) {
            int q = sc.nextInt(); // Number of numbers to generate
            int p = sc.nextInt(); // This variable isn't used, consider removing it if unnecessary

            for (int i = 0; i < q; i++) {
                int num = i * i;
                String numberStr = String.format("%04d", num); // Ensures a 4-digit format

                // Extract the first two digits
                int firstPart = Integer.parseInt(numberStr.substring(0, 2));

                // Extract the last two digits
                int secondPart = Integer.parseInt(numberStr.substring(2, 4));

                int res = firstPart + secondPart;
                
                if (i == 1) {
                    System.out.print("1"); // Seems like this should be printed at the beginning of the first result
                }
                
                System.out.print(res + " "); // Print result for this iteration
            }
            System.out.println(); // Move to the next line after each test case
        }
    }

    public static void main(String[] args) {
        // new practice().digit_add();
        new practice().mk_number();
    }
}
