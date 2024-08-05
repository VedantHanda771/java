import java.util.Arrays;
import java.util.Scanner;

public class C_Light_Switches {

    // Function to check if the given value `testValue` meets the criteria with array `values` and integer `step`
    static boolean isValid(long testValue, long[] values, long step) {
        for (long value : values) {
            long difference = testValue - value;
            long quotient = difference / step;
            if (quotient % 2 == 1) return false; // If quotient is odd, return false
            if (testValue >= value + quotient * step && testValue <= value + (quotient + 1) * step) {
                continue; // Continue if testValue is within the range
            } else {
                return false; // Return false if not within the range
            }
        }
        return true; // Return true if all conditions are met
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long testCases = scanner.nextLong(); // Number of test cases

        while (testCases-- > 0) {
            long numElements = scanner.nextLong(); // Number of elements
            long step = scanner.nextLong(); // Value of step

            long[] elements = new long[(int) numElements]; // Array to hold the elements
            for (int i = 0; i < numElements; i++) {
                elements[i] = scanner.nextLong();
            }

            Arrays.sort(elements); // Sort the array

            boolean found = false;

            // Check for values from elements[numElements - 1] to elements[numElements - 1] + step
            for (long candidate = elements[(int) (numElements - 1)]; candidate <= elements[(int) (numElements - 1)] + step; candidate++) {
                if (isValid(candidate, elements, step)) {
                    System.out.println(candidate);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }

        scanner.close();
    }
}
