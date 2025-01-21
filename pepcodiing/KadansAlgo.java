import java.util.*;


public class KadansAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int result = kAlgo(a,n);
        System.out.println(result);
    }

    public static int kAlgo(int a[], int n){
        int cSum = 0;
        int rv = Integer.MIN_VALUE;

        for(int num :a ){
            if(cSum < 0){
                cSum = 0;
            }
            cSum += num;
            if(cSum > rv ){
                rv = cSum;
            }
        }


        return rv;
    }
    
}
