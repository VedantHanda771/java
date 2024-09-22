import java.util.*;

public class A_Theatre_Square {
    
    public static long maths(int n, int m, int a){
        long TAL = (long) Math.ceil((double) n/a);
        long TAW =(long) Math.ceil((double) m/a);
        return TAL * TAW;

    }

    public static void main(String agrs[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long result = maths(n, m, a);
        System.out.println(result);
        sc.close();

    }
}