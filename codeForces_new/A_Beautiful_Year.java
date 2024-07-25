import java.util.*;

public class A_Beautiful_Year {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();

        while(true){
            y++;
            long a = y/1000;
            long b = y/100 % 10;
            long c = y/10 % 10;
            long d = y%10;

            if(a!=b && b!=c && c!=d&& d!=a && a!=c && b!=d){
                break;
            }
        
        }
        
        System.out.println(y);

    }
}