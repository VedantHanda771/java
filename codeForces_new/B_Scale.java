import java.util.*;

public class B_Scale{
    public static void readGrid(char[][] grid, int n, Scanner sc) { // phela grid
        for (int i = 0; i < n; i++) { //duja loop karta
            String row = sc.next();
            for (int j = 0; j < n; j++) {// loop for  karta
                grid[i][j] = row.charAt(j);
            }
        }
    }

    public static void reduceGrid(char[][] grid, int n, int k) { // 3rd loop jarta
        for (int i = 0; i < n; i += k) {
            for (int j = 0; j < n; j += k) {
                System.out.print(grid[i][j]); //kushvikarta 
            }
            System.out.println();
        } // pritn karta hun
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // main function 
        int t = sc.nextInt(); // scanner 

        while (t-- > 0) {
            int n = sc.nextInt(); //while laga ta
            int k = sc.nextInt();

            char[][] grid = new char[n][n]; //har bana ta 
            readGrid(grid, n, sc); //3rd commnet
            reduceGrid(grid, n, k); // comments 
        }

    }
}
