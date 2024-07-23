import java.util.*;

public class A_Next_Round {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lowest = sc.nextInt();
        int p = 0;

        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
        if (arr[i]>=arr[lowest-1] && arr[i]>0) {
            p++;
        }}

        System.out.println(p);
    }
}