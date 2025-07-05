import java.util.*;

public class D_Retaliation {

    public static boolean canExplode(int[] sequence) {
        int size = sequence.length;
        int diff = sequence[1] - sequence[0];

        for (int i = 2; i < size; i++) {
            if (sequence[i] - sequence[i - 1] != diff) {
                return false;
            }
        }

        int numerator = sequence[0] - diff;
        int denominator = size + 1;

        if (numerator < 0 || numerator % denominator != 0) {
            return false;
        }

        int second = numerator / denominator;
        int first = diff + second;

        return first >= 0 && second >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();

        while (testCases-- > 0) {
            int size = Integer.parseInt(scanner.nextLine());
            String[] input = scanner.nextLine().split(" ");
            int[] sequence = new int[size];
            for (int i = 0; i < size; i++) {
                sequence[i] = Integer.parseInt(input[i]);
            }

            result.append(canExplode(sequence) ? "YES\n" : "NO\n");
        }

        System.out.print(result.toString());
        scanner.close();
    }
}
