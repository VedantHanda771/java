import java.util.*;

public class B_The_Corridor_or_There_and_Back_Again {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int minK = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                int d = scanner.nextInt();
                int s = scanner.nextInt();
                
                int maxSafeK;
                if (s % 2 == 0) {
                    maxSafeK = (d - 1) + (s / 2);
                } else {
                    maxSafeK = (d - 1) + ((s + 1) / 2);
                }
                
                minK = Math.min(minK, maxSafeK);
            }
            
            System.out.println(minK);
        }
        
        // scanner.close();
    }
}
