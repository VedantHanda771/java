import java.util.Scanner;

public class  A_Police_Recruits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of events
        int availableOfficers = 0; // Track available officers
        int untreatedCrimes = 0; // Track untreated crimes

        // Process each event
        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();
            if (event == -1) {
                if (availableOfficers > 0) {
                    availableOfficers--; // Handle the crime
                } else {
                    untreatedCrimes++; // Crime goes untreated
                }
            } else {
                availableOfficers += event; // Recruit new officers
            }
        }

        // Output the number of untreated crimes
        System.out.println(untreatedCrimes);
    }
}
