import java.util.*;

public class A_Goals_of_Victory {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n-1;i++){
                a[i] = sc.nextInt();
            }

            long sum = 0;
            for(int i = 0;i<n-1;i++){
                sum += a[i];
            }
            System.out.println(-1*sum);
        }
    }
}