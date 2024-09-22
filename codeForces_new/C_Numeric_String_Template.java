import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_Numeric_String_Template {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline character
        
        StringBuilder result = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of elements in the array
            scanner.nextLine(); // Consume the newline character
            
            // Read the array a
            String[] aStrings = scanner.nextLine().split(" ");
            long[] a = new long[n]; // Changed to long for larger range
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(aStrings[i]); // Parsing as long
            }
            
            int m = scanner.nextInt(); // Number of strings to check
            scanner.nextLine(); // Consume the newline character
            
            // Process each string
            for (int j = 0; j < m; j++) {
                String s = scanner.nextLine();
                if (checkTemplate(a, s)) {
                    result.append("YES\n");
                } else {
                    result.append("NO\n");
                }
            }
        }
        
        // Output all results at once for efficiency
        System.out.print(result);
        scanner.close();
    }

    private static boolean checkTemplate(long[] a, String s) {
        if (a.length != s.length()) {
            return false; // Length mismatch
        }
        
        Map<Long, Character> aToChar = new HashMap<>();
        Map<Character, Long> charToA = new HashMap<>();
        
        for (int i = 0; i < a.length; i++) {
            long num = a[i];
            char ch = s.charAt(i);
            
            if (aToChar.containsKey(num)) {
                if (aToChar.get(num) != ch) {
                    return false; // Conflict in mapping
                }
            } else {
                aToChar.put(num, ch);
            }
            
            if (charToA.containsKey(ch)) {
                if (charToA.get(ch) != num) {
                    return false; // Conflict in mapping
                }
            } else {
                charToA.put(ch, num);
            }
        }
        
        return true; // All mappings are consistent
    }
}
