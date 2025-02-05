import java.util.Scanner;

class Solution {
    public String thousandSeparator(int n) {
        String ns = Integer.toString(n);
        StringBuilder s = new StringBuilder(ns);

        if (n > 999) {
            for (int i = ns.length() - 3; i < ns.length() - 1; i -= 3) {
                s.append('.');
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read an integer input from the user
        
        Solution solution = new Solution();

        // Output the result of the thousandSeparator method
        System.out.println("Formatted number: " + solution.thousandSeparator(n));

        // Close the scanner
        scanner.close();
    }
}

