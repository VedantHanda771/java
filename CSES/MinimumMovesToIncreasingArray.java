import java.util.Scanner;

public class MinimumMovesToIncreasingArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        long result = minimumMovesToIncreasing(arr);

        
        System.out.println(result);

        scanner.close();
    }

    public static long minimumMovesToIncreasing(int[] arr) {
        long moves = 0;
        int previous = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < previous) {
                moves += (previous - arr[i]);
                arr[i] = previous; 
            } else {
                previous = arr[i]; 
            }
        }

        return moves;
    }
}
