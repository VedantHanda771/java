import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nQueen {

    // Method to check if placing a queen at (row, col) is valid
    public boolean isValid(List<String> curr, int row, int col) {
        // Check column for any queen
        for (int i = row; i >= 0; --i) {
            if (curr.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; --i, --j) {
            if (curr.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < curr.size(); --i, ++j) {
            if (curr.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    // DFS method to solve the N-Queens problem
    public void dfs(List<List<String>> result, List<String> curr, int start) {
        // If all queens are placed, add the solution to the result
        if (start == curr.size()) {
            result.add(new ArrayList<>(curr));
            return;
        }

        // Try placing a queen in each column of the current row
        for (int i = 0; i < curr.size(); ++i) {
            if (!isValid(curr, start, i)) {
                continue;
            }
            // Place a queen at (start, i)
            StringBuilder sb = new StringBuilder(curr.get(start));
            sb.setCharAt(i, 'Q');
            curr.set(start, sb.toString());

            // Recur for the next row
            dfs(result, curr, start + 1);

            // Backtrack and remove the queen
            sb.setCharAt(i, '.');
            curr.set(start, sb.toString());
        }
    }

    // Main method to solve the N-Queens problem
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        // Initialize the board with all '.'
        for (int i = 0; i < n; i++) {
            curr.add(".".repeat(n));
        }

        // Start the depth-first search
        dfs(result, curr, 0);

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        // Input n from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        nQueen solution = new nQueen();
        List<List<String>> result = solution.solveNQueens(n);

        // Print all the possible solutions
        if (result.isEmpty()) {
            System.out.println("No solution exists.");
        } else {
            for (List<String> sol : result) {
                for (String row : sol) {
                    System.out.println(row);
                }
                System.out.println();
            }
        }
    }
}
