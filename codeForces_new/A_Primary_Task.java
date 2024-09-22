import java.util.Scanner;

public class A_Primary_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tc = scanner.nextInt(); // Read number of test cases
        scanner.nextLine(); // Consume the newline character

        while (tc-- > 0) {
            String n = scanner.nextLine(); // Read the string
            
            if (n.length() < 3 || n.charAt(0) != '1' || n.charAt(1) != '0' || n.charAt(2) == '0') {
                System.out.println("NO");
            } else if (n.length() == 3) {
                if (n.charAt(2) == '1') {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("YES");
            }
        }
        
        scanner.close();
    }
}
