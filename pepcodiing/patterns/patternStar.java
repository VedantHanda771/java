import java.util.*;

public class patternStar {
    public static void main(String[] args) { // Corrected 'agrs' to 'args'
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read user input

        for (int i = 0; i < n; i++) { // Loop from 0 to n-1
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t"); // Print asterisk followed by a tab
            }
            System.out.println(); // Move to the next line after inner loop
        }
        sc.close(); // Close the scanner
    }
}
