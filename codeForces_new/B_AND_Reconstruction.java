import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_AND_Reconstruction {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int numTests = Integer.parseInt(tokenizer.nextToken());
        List<TestCase> testCases = new ArrayList<>(numTests);
        
        // Read input for each test case
        for (int i = 0; i < numTests; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int arraySize = Integer.parseInt(tokenizer.nextToken());
            List<Integer> inputArray = new ArrayList<>(arraySize - 1);
            
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < arraySize - 1; j++) {
                inputArray.add(Integer.parseInt(tokenizer.nextToken()));
            }
            testCases.add(new TestCase(arraySize, inputArray));
        }

        // Construct valid arrays for each test case
        List<List<Integer>> results = buildValidArrays(numTests, testCases);

        // Print results for each test case
        for (List<Integer> result : results) {
            if (result.size() == 1 && result.get(0) == -1) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < result.size(); i++) {
                    System.out.print(result.get(i) + (i + 1 == result.size() ? "\n" : " "));
                }
            }
        }
    }

    private static List<List<Integer>> buildValidArrays(int numTests, List<TestCase> testCases) {
        List<List<Integer>> results = new ArrayList<>();

        // Iterate over each test case
        for (TestCase testCase : testCases) {
            int arraySize = testCase.arraySize;
            List<Integer> inputArray = testCase.inputArray;

            // Initialize the result array with zeros
            List<Integer> resultArray = new ArrayList<>(arraySize);
            for (int i = 0; i < arraySize; i++) {
                resultArray.add(0);
            }
            resultArray.set(0, inputArray.get(0));
            boolean isValid = true;

            // Iterate over the input array to construct the result array
            for (int i = 1; i < arraySize - 1; ++i) {
                resultArray.set(i, inputArray.get(i - 1) | inputArray.get(i));
                if ((resultArray.get(i - 1) & resultArray.get(i)) != inputArray.get(i - 1)) {
                    isValid = false;
                    break;
                }
            }

            // Set the last element of the result array
            resultArray.set(arraySize - 1, inputArray.get(arraySize - 2));
            if (isValid && (resultArray.get(arraySize - 2) & resultArray.get(arraySize - 1)) != inputArray.get(arraySize - 2)) {
                isValid = false;
            }

            // Add the result array to the results list if it is valid
            if (isValid) {
                results.add(resultArray);
            } else {
                List<Integer> invalidResult = new ArrayList<>();
                invalidResult.add(-1);
                results.add(invalidResult);
            }
        }

        return results;
    }

    static class TestCase {
        int arraySize;
        List<Integer> inputArray;

        TestCase(int arraySize, List<Integer> inputArray) {
            this.arraySize = arraySize;
            this.inputArray = inputArray;
        }
    }
}
