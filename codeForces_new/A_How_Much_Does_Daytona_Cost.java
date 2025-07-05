import java.util.*;

public class A_How_Much_Does_Daytona_Cost {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t--> 0){
            Long n = sc.nextLong();
            Long m = sc.nextLong();
            long[] a = new long[n.intValue()];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            int cnt = 0;
            for(int i=0;i<n;i++){
                if(a[i] == m){
                    System.out.println("YES");
                    cnt++;
                    break;
                }
            }
            if(cnt == 0){
                System.out.println("NO");
            }
        }
    }
}