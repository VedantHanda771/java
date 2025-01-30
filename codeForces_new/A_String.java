import java.util.*;

public class A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            String binaryString = scanner.next();
            System.out.println(minOperations(binaryString));
        }
        scanner.close();
    }

    private static int minOperations(String binaryString) {
        int steps = 0;
        char[] bits = binaryString.toCharArray();

        while (containsOne(bits)) {
            flipAlternatingOnes(bits);
            steps++;
        }

        return steps;
    }

    private static boolean containsOne(char[] bits) {
        for (char bit : bits) {
            if (bit == '1')
                return true;
        }
        return false;
    }

    private static void flipAlternatingOnes(char[] bits) {
        boolean[] flipPositions = new boolean[bits.length];
        int lastOnePosition = -1;

        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == '1' && (lastOnePosition == -1 || bits[lastOnePosition] == '0')) {
                flipPositions[i] = true;
                lastOnePosition = i;
            }
        }

        for (int i = 0; i < bits.length; i++) {
            if (flipPositions[i])
                bits[i] = '0';
        }
    }
}
