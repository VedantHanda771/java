import java.util.Scanner;

public class C_Cirno_and_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            int size = scanner.nextInt();
            long[] numbers = new long[size];
            
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextLong();
            }
            
            long answer = findMaximumSum(size, numbers);
            System.out.println(answer);
        }
        scanner.close();
    }

    public static long findMaximumSum(int size, long[] numbers) {
        if (size == 1) {
            return numbers[0];
        }

        long bestSum = calculateArraySum(numbers);

        for (int operations = 1; operations < size; operations++) {
            long[] temp = numbers.clone();
            
            for (int step = 0; step < operations; step++) {
                if (temp.length == 1) {
                    break;
                }
                
                if (temp[0] > temp[temp.length - 1]) {
                    reverseArray(temp);
                }
                
                temp = calculateDifferences(temp);
            }
            
            bestSum = Math.max(bestSum, calculateArraySum(temp));
        }
        return bestSum;
    }

    private static long[] calculateDifferences(long[] arr) {
        long[] differences = new long[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            differences[i] = arr[i + 1] - arr[i];
        }
        return differences;
    }

    private static long calculateArraySum(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            sum += num;
        }
        return sum;
    }

    private static void reverseArray(long[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            long temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
