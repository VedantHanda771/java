import java.util.*;

public class B_Card_Game {

    void sol() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int winCount = 0;

            // Generate 
            int[] suneetCards = {a1, a2};
            int[] slavicCards = {b1, b2};

            // Ilterate
            for (int i = 0; i < 2; i++) { // First 
                for (int j = 0; j < 2; j++) { // Second 
                    if (i == j) continue; // Skip 

                    for (int k = 0; k < 2; k++) { // Third 
                        for (int l = 0; l < 2; l++) { // Fourth 
                            if (k == l) continue; // Skip

                            int suneetWins = 0;//inlsalize
                            int slavicWins = 0;//inilize

                            // Compare cards for each round
                            if (suneetCards[i] > slavicCards[k]) suneetWins++;
                            else if (suneetCards[i] < slavicCards[k]) slavicWins++;
                            
                            if (suneetCards[j] > slavicCards[l]) suneetWins++;
                            else if (suneetCards[j] < slavicCards[l]) slavicWins++;

                            // Determine if Suneet wins more rounds
                            if (suneetWins > slavicWins) {
                                winCount++;
                            }
                        }
                    }
                }
            }
            
            System.out.println(winCount);
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        new B_Card_Game().sol(); // Create an instance and call sol() method
    }
}
