import java.util.Scanner;

public class decRecursion {
    public static void int1(int value) {
    // Base case to stop recursion
    if (value == 0) {
        return;  // Exit the method when value reaches 0
    }
    
    System.out.println(value);  // Print the current value
    int1(value - 1);  // Recursively call the function with value - 1
}

    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int1(n);
        
    }
}
