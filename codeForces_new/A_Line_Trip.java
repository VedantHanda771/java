import java.util.*;

public class A_Line_Trip {

    public static void main(String agrs[]){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            int size = scanner.nextInt();
            int k = scanner.nextInt();
            long[] numbers = new long[size];
            
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextLong();
            }
            
            long answer = tank(size,k, numbers);
            System.out.println(answer);
        }
        scanner.close();
    }

    public static long tank(int n, int k, long[] arr){
        
        long max = Math.max(arr[0]-0, 2*(k-arr[n-1]));
        for(int i = 1; i < n; i++){
            max = Math.max(max, (arr[i]-arr[i-1]));
        }

        return max;
    }
}