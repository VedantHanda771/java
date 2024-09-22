import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Sum_of_Round_Numbers {

    // Function to decompose a number into round numbers
    private static List<Integer> decomposeIntoRoundNumbers(long n) {
        List<Integer> roundNumbers = new ArrayList<>();
        long factor = 1;

        while (n > 0) {
            long digit = n % 10;
            if (digit != 0) {
                roundNumbers.add((int) (digit * factor));
            }
            n /= 10;
            factor *= 10;
        }

        return roundNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        // Process each test case
        while (t-- > 0) {
            long n = sc.nextLong();
            List<Integer> roundNumbers = decomposeIntoRoundNumbers(n);

            // Output the number of round numbers and the round numbers themselves
            System.out.println(roundNumbers.size() + " ");
            for (int num : roundNumbers) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line after printing all round numbers
        }

        sc.close();
    }
}