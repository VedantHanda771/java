import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class distinct {
    public static long int1(long value, BufferedReader br) throws IOException {
        if (value <= 0) {
            return 0; // Handle case for non-positive values
        }

        long[] inputs = new long[(int) value];

        // Read input values into the array
        String[] inputStrings = br.readLine().split(" ");
        for (int i = 0; i < value; i++) {
            inputs[i] = Long.parseLong(inputStrings[i]);
        }

        // Sort the array
        Arrays.sort(inputs);

        // Count distinct elements
        long count = 1; // Start with 1 for the first element
        for (int i = 1; i < value; i++) {
            if (inputs[i] != inputs[i - 1]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); // Read the number of elements
        long result = int1(n, br); // Call the method
        System.out.println(result); // Print the number of distinct elements
    }
}
