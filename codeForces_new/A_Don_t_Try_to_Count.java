import java.util.*;

public class A_Don_t_Try_to_Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        
        while (tests-- > 0) {
            long n = sc.nextLong();
            Long m = sc.nextLong();
            sc.nextLine();
            String s = sc.nextLine();
            String t = sc.nextLine();

            String current = s;
            int operations = 0;
            boolean found = false;

            for (int i = 0; i <= 10; i++) { // max 10 iterations due to small constraints
                if (current.contains(t)) {
                    System.out.println(operations);
                    found = true;
                    break;
                }
                current += current; // x = x + x
                operations++;
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}