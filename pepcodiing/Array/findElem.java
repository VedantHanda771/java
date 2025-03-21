import java.util.*;

public class findElem {
    public static int find(int []arr, int n, int k){
        int rv = -1;
        for(int i = 0;i<n;i++){
            if(arr[i] == k){
                rv = i;
                break;
            }
        }

        return rv;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = find(arr, n, k);
        System.out.println(res);
    }
}
