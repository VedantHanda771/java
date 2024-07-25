import java.util.Arrays;
import java.util.Scanner;



public class B_1_Bouquet_Easy_Version {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner lai lia 

        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) { // t zero karia
            long n = scanner.nextLong(); // Number of petals 
            long m = scanner.nextLong(); // Maximum cost
            long[] petals = new long[(int) n]; // Create petals array with size n (

            // Reading petals array
            for (int i = 0; i < n; ++i) { // array liti
                petals[i] = scanner.nextLong(); // Read each petal vthe array
            }

            Arrays.sort(petals); // Sort petals array in non-decre
            long maxPetals = 0; //sabtoh vad padal liite
            long currentPetals = 0, currentCost = 0; // dono zero zero karte
            int start = 0; // ehvi zeor kakrerra

            // Sliding w to find maximum sum of petals within cost limit m
            for (int end = 0; end < n; ++end) {
                currentPetals += petals[end]; //curetni pedal nu end kita 
                currentCost += petals[end]; // cost nu vi end akrt a

                // justing window if costend and start petals is more than 1
                while (start <= end && (currentCost > m || (petals[end] - petals[start] > 1))) { // or lagahdsya 
                    currentPetals -= petals[start]; // thalle vala smaeek kitta
                    currentCost -= petals[start]; //saem uppar vala kitta
                    ++start; // start vada ta 
                }

                // Updating maxPetals with maximum sum found within cost limit
                if (currentCost <= m) { //current max toh ght kitta
                    maxPetals = Math.max(maxPetals, currentPetals); //max da kitta 
                }
            }

            // Outputting maximumought within cost limit m
            System.out.println(maxPetals);
        }

        scanner.close(); // Closing scanr
    }
}
