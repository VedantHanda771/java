import java.io.*;
import java.util.*;

public class E_1_Eliminating_Balls_With_Merging_Easy_Version {

    // Function to handle each test case
    private static void handleTestCase(int n, int x, int[] a) {
        int[] result = new int[n - x + 1];

        // Iterate over each i from x to n
        for (int i = x; i <= n; i++) {
            // Create an array to keep track of achievable indices
            boolean[] achievable = new boolean[i];
            Arrays.fill(achievable, false);
            achievable[i - 1] = true;

            // Perform i-1 operations
            for (int op = 0; op < i - 1; op++) {
                boolean[] newAchievable = new boolean[i];
                Arrays.fill(newAchievable, false);

                // Simulate merging operations
                for (int j = 0; j < i - 1; j++) {
                    if (achievable[j]) {
                        int l = j;
                        int r = l + 1;

                        while (r < i) {
                            if (a[l] > a[r]) {
                                a[l] += a[r];
                                newAchievable[l] = true;
                            } else if (a[l] < a[r]) {
                                a[r] += a[l];
                                newAchievable[r] = true;
                            } else {
                                if (l + 1 < r) {
                                    a[r] += a[l];
                                    newAchievable[r] = true;
                                } else {
                                    a[l] += a[r];
                                    newAchievable[l] = true;
                                }
                                break;
                            }
                            r++;
                        }
                    }
                }

                achievable = newAchievable;
            }

            // Count the number of achievable indices
            int count = 0;
            for (boolean value : achievable) {
                if (value) {
                    count++;
                }
            }
            result[i - x] = count;
        }

        // Print the result for this test case
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    // Main function to read input and process each test case
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int t = Integer.parseInt(br.readLine().trim());

        // Process each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Read n and x
            String[] tokens = br.readLine().trim().split(" ");
            int n = Integer.parseInt(tokens[0]);
            int x = Integer.parseInt(tokens[1]);

            // Read the array a
            tokens = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Handle the test case
            handleTestCase(n, x, a);
        }
    }
}
