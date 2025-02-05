import java.util.*;

public class GcdLcm {
    public static int findGcd(int n1, int n2) {
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;
        System.out.println("LCM: " + lcm); // Print the LCM
        return gcd; // Return GCD
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd = findGcd(n, m); // Call the method to get GCD
        System.out.println("GCD: " + gcd); // Print the GCD
    }
}
