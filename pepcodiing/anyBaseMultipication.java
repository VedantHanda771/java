import java.util.*;

public class anyBaseMultipication {

    public static int getProductBySingleDigit(int b, int n, int d2){
        int rv = 0;
        int power = 1;
        int carry = 0;
        while(n>0 || carry>0){
            int d1 = n%10;
            n = n/10;
            int d = d1 * d2 + carry;
            carry = d/b;
            d = d% b;

            rv = rv + d * power;
            power = power * 10;
        }
        return rv;
    }
    public static int getSum(int b, int n, int m){
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
            power = power * 10;
        }
        
        return rv;
    }

    public static int getProduct(int b, int n, int m){
        // format of vh771 
        // code writing
        int rv = 0;
        int power = 1;
        while(m>0){
            int d2 = m%10;
            m = m/10;
            int sprd = getProductBySingleDigit(b, n, d2);
            rv = getSum(b, rv, sprd * power);
            power = power *10;
        }
        return rv;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = getProduct(base, in1, in2);
        System.out.println(result);
    }
}
