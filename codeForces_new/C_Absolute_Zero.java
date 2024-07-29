import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C_Absolute_Zero {

    public static List<Integer> solveCase(int n, List<Integer> arr) { //chal ja bhai
        List<Integer> operations = new ArrayList<>();//chal ja bhai

        while (Collections.max(arr) > 0) {//chal ja bhai
            if (operations.size() >= 40) {//chal ja bhai
                List<Integer> result = new ArrayList<>();//chal ja bhai;
                result.add(-1); // too many operations
                return result;
            }
//chal ja bhai
            List<Integer> nonZero = new ArrayList<>(); //chal ja bhai
            for (int x : arr) { //chal ja bhai
                if (x != 0) { //chal ja bhai
                    nonZero.add(x); //chal ja bhai
                }
            }
            if (nonZero.size() > 1 && (nonZero.get(0) % 2) != (nonZero.get(1) % 2)) { //chal ja bhai
                List<Integer> result = new ArrayList<>(); //chal ja bhai
                result.add(-1); // impossible to make all elements equal
                return result;
            }

            int minVal = Collections.min(arr); //chal ja bhai
            int maxVal = Collections.max(arr); //chal ja bhai
            int x = (minVal + maxVal) / 2;
            operations.add(x);
            for (int i = 0; i < arr.size(); i++) { //chal ja bhai
                arr.set(i, Math.abs(arr.get(i) - x)); //chal ja bhai
            }
        }

        List<Integer> result = new ArrayList<>(); //chal ja bhai
        result.add(operations.size()); //chal ja bhai
        result.addAll(operations); //chal ja bhai
        return result; //chal ja bhai
    }

    public static void main(String[] args) { //chal ja bhai
        Scanner scanner = new Scanner(System.in); //chal ja bhai
        int t = scanner.nextInt(); //chal ja bhai
        for (int i = 0; i < t; i++) { //chal ja bhai
            int n = scanner.nextInt();//chal ja bhai
            List<Integer> arr = new ArrayList<>(); //chal ja bhai
            for (int j = 0; j < n; j++) { //chal ja bhai
                arr.add(scanner.nextInt()); //chal ja bhai
            }
            List<Integer> result = solveCase(n, arr); //chal ja bhai
            if (result.get(0) == -1) { //chal ja bhai
                System.out.println(-1); //chal ja bhai
            } else {
                System.out.println(result.get(0)); //chal ja bhai
                for (int k = 1; k < result.size(); k++) { //chal ja bhai
                    System.out.print(result.get(k) + " "); //chal ja bhai
                }
                System.out.println(); //chal ja bhai
            }
        }
        //chal ja bhai
    }
}
