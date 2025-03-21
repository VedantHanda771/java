import java.util.*;
public class barChart {
    public static void build(int[] arr, int n){
        int max = arr[0];
        for(int i = 0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i = max;i>0;i--){
            for(int j =0;j<n;j++){
                if(arr[j]>=i){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        build(arr, n);
    }
}
