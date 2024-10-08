import java.util.*;

public class A_Even_Odds {

    public static long int2(long n, long m) {
        // format of vh771
        // code writing
        long oddNum = (n + 1) / 2;
        if (m <= oddNum) {
            System.out.println(m + (m - 1));
        } else {
            System.out.println(2 * (m - oddNum));
        }

        return 0;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        long in1 = sc.nextLong();
        long in2 = sc.nextLong();
        long result = int2(in1, in2);
        // System.out.println(result);
    }

}