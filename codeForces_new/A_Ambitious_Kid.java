import java.util.*;

public class A_Ambitious_Kid {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;

        long[] a = new long[(int)n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextLong();
            // if(a[i] == 0){
            //     System.out.println(0);
            // }
        }

        long min = Long.MAX_VALUE;
        for(int i = 0;i<n;i++){
            min = Math.min(min, Math.abs(a[i]));
        }
        System.out.println(min);

    }
}