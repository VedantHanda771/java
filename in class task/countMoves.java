public class countMoves {
    public static int countHanoiMoves(int n) {
        if (n <= 0) {
            return 0;
        }
        // Formula for Tower of Hanoi moves: 2^n - 1
        return (1 << n) - 1;
    }

    public static void main(String[] args) {
        // Example usage
        int disks = 3;
        System.out.println("Number of moves for " + disks + " disks: " + countHanoiMoves(disks));
    }
}
