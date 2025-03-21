import java.util.*;

public class arraySum {
    public static void sum(int[] arr1,int n, int[] arr2,int m){
        int[] sum = new int[n >m ?n : m];
        int i = n-1;
        int j = m-1;
        int k = sum.length-1;
        int c = 0;
        while(k>=0){
            int d = c;
            if(i>=0){
                d += arr1[i];
            }
            if(j>=0){
                d += arr2[j];
            }
            c = d/10;
            d = d%10;
            sum[k] = d;
            i--; j--; k--;
        }
        if(c!= 0){
            System.out.print(c + " ");
        }
        for(int v : sum){
            System.out.print(v + " ");
        }
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        sum(arr1,n,arr2,m);
    }
}
