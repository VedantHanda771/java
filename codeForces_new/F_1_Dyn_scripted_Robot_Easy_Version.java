import java.util.Scanner;

public class F_1_Dyn_scripted_Robot_Easy_Version {

    // Function to simulate and count visits to (0,0)
    static long countVisits(int n, int k, int w, int h, String s) {
        // Robot's starting position
        long x = 0, y = 0;
        // Initialize visit count
        long visitCount = 0;

        // Visit count for one full execution of the script
        long oneRunVisitCount = 0;

        // Simulate one run of the script
        for (char command : s.toCharArray()) {
            if (command == 'L') {
                if (x == 0) {
                    // Change L to R if hitting left border
                    command = 'R';
                }
                x--;
            } else if (command == 'R') {
                if (x == w) {
                    // Change R to L if hitting right border
                    command = 'L';
                }
                x++;
            } else if (command == 'U') {
                if (y == h) {
                    // Change U to D if hitting top border
                    command = 'D';
                }
                y++;
            } else if (command == 'D') {
                if (y == 0) {
                    // Change D to U if hitting bottom border
                    command = 'U';
                }
                y--;
            }

            // Count visit to (0,0)
            if (x == 0 && y == 0) {
                oneRunVisitCount++;
            }
        }

        // Total visits to (0,0) in k executions
        long totalVisitCount = oneRunVisitCount * k;

        return totalVisitCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String s = sc.nextLine();

            // Calculate and print the result for this test case
            long result = countVisits(n, k, w, h, s);
            System.out.println(result);
        }

        sc.close(); // Close the scanner
    }
}
