import java.util.Arrays;
import java.util.Scanner;

public class TestCaseExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Handling integer array input
        int[] arr1 = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        throw new ArithmeticException(Arrays.toString(arr1));

        // Handling single integer input
        int y = in.nextInt();
        throw new ArithmeticException(Integer.toString(y));

        // Handling string input
        String z = in.nextLine();
        throw new ArithmeticException(z);

        // Handling 2D integer array input
        int[][] arr2 = new int[2][2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        String s1 = "";
        for (int i = 0; i < arr2.length; i++) {
            s1 += Arrays.toString(arr2[i]) + " ";
        }

        throw new ArithmeticException(s1);
    }
}