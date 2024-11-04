import java.util.Scanner;

public class BlockedNQueensCount {

    // Method to check if it's safe to place a queen at (row, col)
    public static boolean isValid(char[][] board, int row, int col) {
        int n = board.length;

        // Blocked cell check
        if (board[row][col] == '*') {
            return false;
        }

        // Check the same column for any other queen
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Recursive method to place queens
    public static void dfs(char[][] board, int row, int[] count) {
        int n = board.length;

        // If we reach the last row, it means we've placed queens successfully
        if (row == n) {
            count[0]++;  // Increment the valid configuration count
            return;
        }

        // Try placing the queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q';  // Place queen
                dfs(board, row + 1, count);  // Move to the next row
                board[row][col] = '.';  // Backtrack and remove the queen
            }
        }
    }

    // Method to count how many ways queens can be placed on a board with blocked cells
    public static int countNQueens(char[][] board) {
        int[] count = {0};  // Array to hold the count of valid configurations
        dfs(board, 0, count);
        return count[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the board size
        int n = 8;  // For this example, we're using an 8x8 board

        // Input the board configuration (with '*' for blocked cells and '.' for empty cells)
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            board[i] = line.toCharArray();
        }

        // Get the number of valid solutions
        int result = countNQueens(board);

        // Output the result
        System.out.println( result);

        sc.close();
    }
}
