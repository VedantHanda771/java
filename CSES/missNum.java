import java.util.*;

public class missNum {
    public static long int1(long value, Scanner sc) {
        // format of vh771
        // code writing 
        long sums = (value * (value+1))/2;
        long mis = 0;
        for (long i = 0;i<value-1;i++){
            long c = sc.nextLong();
            mis +=c;
        }
        System.out.println(sums- mis);
        return 1;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = int1(n, sc);
        // System.out.println(result);
    }

}
