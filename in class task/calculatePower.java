import java.util.*;

public class calculatePower {
    public static int int2(int n, int m){
        // format of vh771 
        // code writing
        if(m == 0){
            return 1;
        }
        int xpnb2 = int2(n,m/2);
        int xn = xpnb2 * xpnb2;
        if(m%2 == 1){
            xn = xn * n;
        }
        return xn;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = int2(in1, in2);
        System.out.println(result);
    }
}
