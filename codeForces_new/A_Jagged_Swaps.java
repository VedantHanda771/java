import java.util.*;

public class A_Jagged_Swaps {

    public static void main(String agrs[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            String answer = swap(n, arr);
            System.out.println(answer);
        }
        scanner.close();
    }

    public static String swap(int n, int[] arr) {
        
        if(arr[0] != 1){
            return "NO";
        }

        return "YES";
    }
}