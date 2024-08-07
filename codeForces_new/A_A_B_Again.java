import java.util.*;

public class A_A_B_Again {

    void sol() {
        Scanner sc = new Scanner(System.in);//input onr
        long t = sc.nextLong(); // Number of test cases
        
        for (int i = 0; i < t; i++) { //first for
            long n = sc.nextLong(); // Read the number
            String nStr = Long.toString(n); // Convert the number to a string
            long sum = 0; // Initialize sum for this test case
            
            for (int j = 0; j < nStr.length() - 1; j++) { // Iterate through the string
                sum += (nStr.charAt(j) - '0') + (nStr.charAt(j + 1) - '0'); // Sum adjacent digits
            }
            
            System.out.println(sum); // Print the result for this test case
        }
    }

    public static void main(String[] args) {
        new A_A_B_Again().sol(); // Create an instance and call sol() method
    }
}
