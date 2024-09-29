import java.util.Scanner;

public class A_cAPS_lOCK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        boolean allUppercase = true;

        // Check if the entire string is uppercase
        for (int i = 0; i < length; i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                allUppercase = false;
                break;
            }
        }

        // Check if all letters except the first one are uppercase
        char firstChar = s.charAt(0);
        String remainingChars = s.substring(1);
        if (Character.isLowerCase(firstChar) && remainingChars.equals(remainingChars.toUpperCase())) {
            allUppercase = true;
        }

        // If we need to swap cases, do it
        if (allUppercase) {
            for (int i = 0; i < length; i++) {
                char u = s.charAt(i);
                // Swap the case
                if (Character.isLowerCase(u)) {
                    u = Character.toUpperCase(u);
                } else {
                    u = Character.toLowerCase(u);
                }
                System.out.print(u);
            }
        } else {
            // Otherwise, print the original string
            System.out.println(s);
        }
        
        sc.close(); // Close the scanner
    }
}
