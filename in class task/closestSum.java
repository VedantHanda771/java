import java.util.*;
public class closestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        int result = closestSum(arr,n, target);
        System.out.println(result);
    }


    public static int closestSum(int[] arr, int n, int target){
        int i = 0;
        int j = n-1;
        
    }
}
