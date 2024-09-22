import java.util.*;

public class A_The_New_Year_Meeting_Friends {

    // Function to find the median of three numbers
    public static int findMedian(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr); // Sort the array
        return arr[1]; // The median is the second element after sorting
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the coordinates
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        
        // Find the median
        int median = findMedian(x1, x2, x3);
        
        // Calculate the total distance to the median
        int totalDistance = Math.abs(x1 - median) + Math.abs(x2 - median) + Math.abs(x3 - median);
        
        // Print the result
        System.out.println(totalDistance);

        sc.close(); // Close the scanner
    }
}
