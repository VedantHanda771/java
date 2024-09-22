import java.util.Scanner;

public class B_Seating_in_a_Bus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt(); // Read number of test cases
        
        while (tc-- > 0) {
            long n = scanner.nextLong(); // Read the size of the array
            long[] a = new long[(int) n + 1]; // Array to store the input values
            long[] b = new long[(int) n + 1]; // Array to track positions
            
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextLong(); // Read each value into array 'a'
                b[(int) a[i]] = i; // Update the position in array 'b'
            }

            boolean isValid = true;
            for (long i = a[1] + 1; i <= n; i++) {
                if (b[(int) (i - 1)] > b[(int) i]) {
                    isValid = false;
                    break;
                }
            }

            for (long i = a[1] - 1; i > 0; i--) {
                if (b[(int) (i + 1)] > b[(int) i]) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
