import java.util.*;

public class B_Apples_in_Boxes {
    public static void solve(Scanner in) {
        long x = in.nextLong();
        long y = in.nextLong();

        long[] nums = new long[(int)x];
        for (long i = 0; i < x; i++) {
            nums[(int)i] = in.nextLong();
        }

        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long maxCount = 0;

        for (long i = 0; i < x; i++) {
            sum += nums[(int)i];
            if (nums[(int)i] > max) {
                max = nums[(int)i];
                maxCount = 1;
            } else if (nums[(int)i] == max) {
                maxCount++;
            }
            if (nums[(int)i] < min) {
                min = nums[(int)i];
            }
        }

        if (max - min > y + 1 || (max - min == y + 1 && maxCount > 1)) {
            System.out.println("Jerry");
        } else {
            System.out.println(sum % 2 == 1 ? "Tom" : "Jerry");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long q = in.nextLong();
        for (long i = 0; i < q; i++) {
            solve(in);
        }
        in.close();
    }
}
