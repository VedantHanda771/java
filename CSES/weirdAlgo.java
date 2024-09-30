import java.util.*;

public class weirdAlgo {
    public static long int1(long value) {
        // format of vh771
        // code writing
        System.out.print(value + " ");
        while (value != 1) {
            // System.out.print(value + " ");
            if (value % 2 == 0) {
                value /= 2;
            } else if (value % 2 != 0) {
                value = (value * 3) + 1;
            }
            System.out.print(value + " ");
        }
        return 1;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int1(n);
        // System.out.println(result);
    }
}
