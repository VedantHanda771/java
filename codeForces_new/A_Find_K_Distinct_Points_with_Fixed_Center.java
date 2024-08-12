import java.util.Scanner;

public class A_Find_K_Distinct_Points_with_Fixed_Center {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            int z = k / 2;
            for (int i = 0; i < z; i++) {
                System.out.println((x - i - 1) + " " + y);
                System.out.println((x + i + 1) + " " + y);
            }
            if (k % 2 != 0) {
                System.out.println(x + " " + y);
            }
        }

        scanner.close();
    }
}
