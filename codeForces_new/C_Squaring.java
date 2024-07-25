import java.util.Scanner;

public class C_Squaring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); // Number of test cases
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Size of the array
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int result = minimumActsOfJustice(n, a);
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    public static int minimumActsOfJustice(int n, int[] a) {
        int minActs = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                int neededActs = 0;
                while (a[i] > a[i + 1]) {
                    // Square a[i] and count the operation
                    a[i] = a[i] * a[i];
                    neededActs++;
                    
                    // Check if we're exceeding reasonable bounds
                    if (a[i] > 1_000_000_000 || neededActs > 100) {
                        return -1;
                    }
                }
                minActs += neededActs;
            }
        }
        
        return minActs;
    }
}
