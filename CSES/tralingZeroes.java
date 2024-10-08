import java.util.*;

public class tralingZeroes {
    public static long int1(long value) {
        // format of vh771
        // code writing
        long count = 0;
        while (value >= 5) {
            value /= 5;
            count += value;
        }
        
        return count;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = int1(n);
        System.out.println(result);
    }
}
