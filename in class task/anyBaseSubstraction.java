import java.util.*;

public class anyBaseSubstraction {
    public static int int2(int b,int n, int m){
        // format of vh771 
        // code writing
        int rv = 0;
        int borrow = 0;
        int power = 1;
        while(m>0){
            int d1 = n%10;
            int d2 = m%10;
            n = n/10;
            m = m/10;
            int digit = 0;
            d2 = d2 + borrow;

            if(d2>=d1){
                borrow = 0;
                digit = d2 - d1;
            } else{
                borrow = -1;
                digit = d2 + b - d1;
            }

            rv = rv + digit * power;
            power = power * 10;
        }

        return rv;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = int2(base,in1, in2);
        System.out.println(result);
    }
    
}
