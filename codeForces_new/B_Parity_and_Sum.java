import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Parity_and_Sum {

    // Function to solve the problem as described
    static void solve(Scanner sc) {
        long n = sc.nextLong();
        ArrayList<Long> even = new ArrayList<>();
        ArrayList<Long> odd = new ArrayList<>();

        // Read input values and separate them into odd and even lists
        for (long i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (x % 2 == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }
        }

        // If either list is empty, print 0 and return
        if (even.isEmpty() || odd.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Sort the lists
        Collections.sort(odd);
        Collections.sort(even);

        // Initialize variables
        long val = odd.get(odd.size() - 1);
        long sum = 0;

        // Process the even numbers
        for (long i = 0; i < even.size(); i++) {
            if (val > even.get((int) i)) {
                val += even.get((int) i);
                sum++;
            } else {
                System.out.println(2 + even.size() - 1);
                return;
            }
        }

        // Output the result
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Solve each test case
        while (t-- > 0) {
            solve(sc);
        }

        sc.close(); // Close the scanner
    }
}
