import java.util.*;

// find maximum sum of subarray using kadane's algorithm who matches the target
public class question1K {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int res = kAlgo(a,n,target);
        System.out.println(res);
    }

    public static int kAlgo(int a[], int n, int target){
        int cSum = 0;
        int rv = Integer.MIN_VALUE;

        for(int num: a){
            cSum = Math.max(num, cSum + num);
            rv = Math.max(cSum, rv);
        }


        return rv;
    }
    
}
