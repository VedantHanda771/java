import java.util.Scanner;

public class A_Fox_And_Snake {

    void snake(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();  // Always good practice to close the scanner

        for (int i = 0; i < n; i++) {
            // If it's an even row (0-based index), print a full line of '#'
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print('#');
                }
            } else {
                // If it's an odd row and the row is a left snake row
                if (i % 4 == 1) {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print('.');
                    }
                    System.out.print('#');
                } else {  // If it's an odd row and the row is a right snake row
                    System.out.print('#');
                    for (int j = 1; j < m; j++) {
                        System.out.print('.');
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new A_Fox_And_Snake().snake();
    }
}
