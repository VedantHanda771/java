import java.util.*;

public class A_Lucky_Division {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n % 4 == 0 || n % 7 == 0 || n % 44 == 0 || n % 77 == 0 || 
                n % 47 == 0 || n % 74 == 0 || n % 477 == 0 || n % 447 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}