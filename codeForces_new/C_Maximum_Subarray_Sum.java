import java.util.*;

public class C_Maximum_Subarray_Sum {
    private static final long NEG_INF = -1_000_000_000_000_000_000L;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        while (tests-- > 0) {
            int len = in.nextInt();
            int target = in.nextInt();
            String seq = in.next();
            
            long[] nums = new long[len];
            for (int i = 0; i < len; i++) {
                if (in.hasNextLong()) {
                    nums[i] = in.nextLong();
                } else {
                    System.out.println("Input error at position " + i);
                    return;
                }
            }
            
            long sum = 0;
            long maxSum = Long.MIN_VALUE;
            
            for (int i = 0; i < len; i++) {
                if (seq.charAt(i) == '1') {
                    sum = Math.max(sum + nums[i], nums[i]);
                    maxSum = Math.max(maxSum, sum);
                    if (sum < 0) sum = 0;
                } else {
                    sum = 0;
                }
            }
            
            if (maxSum > target) {
                System.out.println("No");
                continue;
            }

            int firstZero = seq.indexOf('0');

            if (firstZero == -1) {
                if (maxSum == target) {
                    System.out.println("Yes");
                    for (long val : nums) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("No");
                }
                continue;
            }

            // Left sum
            long suffixSum = 0, maxLeft = Long.MIN_VALUE;
            for (int i = firstZero - 1; i >= 0 && seq.charAt(i) == '1'; i--) {
                suffixSum += nums[i];
                maxLeft = Math.max(maxLeft, suffixSum);
            }
            long L = (maxLeft == Long.MIN_VALUE) ? 0 : maxLeft;

            // Right sum
            long prefixSum = 0, maxRight = Long.MIN_VALUE;
            for (int i = firstZero + 1; i < len && seq.charAt(i) == '1'; i++) {
                prefixSum += nums[i];
                maxRight = Math.max(maxRight, prefixSum);
            }
            long R = (maxRight == Long.MIN_VALUE) ? 0 : maxRight;

            long x;
            if (L >= 0 && R >= 0) {
                x = target - L - R;
            } else if (L >= 0 && R <= 0) {
                x = target - L;
            } else if (L <= 0 && R >= 0) {
                x = target - R;
            } else {
                x = target;
            }

            System.out.println("Yes");
            for (int i = 0; i < len; i++) {
                if (seq.charAt(i) == '0') {
                    System.out.print((i == firstZero ? x : NEG_INF) + " ");
                } else {
                    System.out.print(nums[i] + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
