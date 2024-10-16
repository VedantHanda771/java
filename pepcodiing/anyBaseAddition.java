import java.util.*;

public class anyBaseAddition {
    public static int int2(int b, int n, int m){
        // format of vh771 
        // code writing
        int rv = 0;
        int carry = 0;
        int power=1;

        while(n>0 || m>0 || carry>0){
            int d1 = n%10;
            int d2 = m%10;
            n = n/10;
            m = m/10;

            int d = d1 + d2 + carry;
            carry = d/b;
            d = d%b;

            rv += d*power;
            power *= 10;
        }
        
        return rv;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = int2(base, in1, in2);
        System.out.println(result);
    }
}
