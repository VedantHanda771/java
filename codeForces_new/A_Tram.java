import java.util.Scanner;

public class A_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of stops
        
        int max_capacity = 0;
        int current_passengers = 0;
        
        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt(); // passengers exiting
            int bi = sc.nextInt(); // passengers entering
            
            // Update the current number of passengers
            current_passengers -= ai;
            current_passengers += bi;
            
            // Update the maximum capacity encountered so far
            if (current_passengers > max_capacity) {
                max_capacity = current_passengers;
            }
        }
        
        System.out.println(max_capacity);
        sc.close();
    }
}
