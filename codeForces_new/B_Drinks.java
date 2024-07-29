import java.util.*;

public class B_Drinks {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;
        for(long i=0;i<n;i++){
            double a = sc.nextLong();
            sum += a;
        }
        System.out.println(String.format("%.12f",sum/n));
    }
}