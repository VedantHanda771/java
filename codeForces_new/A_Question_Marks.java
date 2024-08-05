import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Question_Marks {

    // Function to compute the result as described
    static int vedant(int n, String s) {
        // Initialize the character counts
        Map<Character, Integer> nums = new HashMap<>();
        nums.put('A', 0);
        nums.put('B', 0);
        nums.put('C', 0);
        nums.put('D', 0);

        // Count occurrences of 'A', 'B', 'C', and 'D'
        for (char ch : s.toCharArray()) {
            if (ch != '?') {
                nums.put(ch, nums.get(ch) + 1);
            }
        }

        // Calculate the result
        int ans = 0;
        ans += Math.min(nums.get('A'), n);
        ans += Math.min(nums.get('B'), n);
        ans += Math.min(nums.get('C'), n);
        ans += Math.min(nums.get('D'), n);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer

        while (t-- > 0) {
            int n = sc.nextInt(); // Read the integer n
            sc.nextLine(); // Consume the newline
            String s = sc.nextLine(); // Read the string s

            // Compute and print the result
            System.out.println(vedant(n, s));
        }

        sc.close(); // Close the scanner
    }
}
