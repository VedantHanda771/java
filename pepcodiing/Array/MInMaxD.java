import java.util.*;
public class MInMaxD {
    public static int findDiff(int[] arr, int n){
        int min = arr[0];
        int max = arr[0];
        int rv = 0;
        for(int i = 1;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        rv = max- min;
        return rv;
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }   
        int res = findDiff(arr, n);
        System.out.println(res);
    }
}
