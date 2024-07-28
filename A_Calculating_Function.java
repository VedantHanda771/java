import java.util.*;

/**
 * A_Calculating_Function
 */
public class A_Calculating_Function {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else
            System.out.println(-(n + 1) / 2);

    }

}