import java.util.*;
public class C_Showering {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long s = sc.nextLong();
            long m = sc.nextLong();
            
            long previousEnd = 0;
            boolean canShower = false;
            
            for (int i = 0; i < n; i++) {
                long l = sc.nextLong();
                long r = sc.nextLong();
                
                // Check if there's enough time before the first task
                if (l - previousEnd >= s) {
                    canShower = true;
                }
                
                previousEnd = r;
            }
            
            // Check the time after the last task
            if (m - previousEnd >= s) {
                canShower = true;
            }
            
            System.out.println(canShower ? "YES" : "NO");
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        new C_Showering().solve();
    }
}