import java.util.Scanner;

public class E_Level_Up {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of monsters and queries
        int n = sc.nextInt();
        int q = sc.nextInt();

        // Read the levels of the monsters
        int[] monsterLevels = new int[n];
        for (int i = 0; i < n; i++) {
            monsterLevels[i] = sc.nextInt();
        }

        // Process each query
        for (int j = 0; j < q; j++) {
            int i = sc.nextInt(); // 1-based index of the monster
            int x = sc.nextInt(); // the number of fights required for a level up

            // Calculate the level Monocarp will be at when he encounters the i-th monster
            int fightsCount = 0;
            int currentLevel = 1;

            // Determine the number of fights before the i-th monster
            for (int k = 0; k < i; k++) {
                if (monsterLevels[k] <= currentLevel) {
                    fightsCount++;
                    if (fightsCount % x == 0) {
                        currentLevel++;
                    }
                }
            }

            // Determine if Monocarp fights the i-th monster
            if (currentLevel > monsterLevels[i - 1]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
