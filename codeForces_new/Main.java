import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Number of test cases

        while (q-- > 0) {
            int n = scanner.nextInt(); // Length of sequences s and t
            String s = scanner.next(); // Binary sequence s
            String t = scanner.next(); // Binary sequence t

            // Check if the game will be interesting
            boolean interesting = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' && t.charAt(i) == '1') {
                    interesting = true;
                    break;
                }
            }

            System.out.println(interesting ? "YES" : "NO");
        }
    }
}
