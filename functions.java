import java.util.*;


public class functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int printSum(int a, int b){
    //     int sum=a+b;
    //     return sum;
    // }

    // public static int product(int a, int b){
    //     return a*b;
    // }

    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        int fact=1;
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);

    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);  // create a scanner
        int n= sc.nextInt();
        // int b=sc.nextInt();
        
        System.out.print("Here is your answer:");
        factorial(n);   // call the function and pass the

    }
}
