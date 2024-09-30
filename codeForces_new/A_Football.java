import java.util.*;

public class A_Football {

    public static String goals(String s, int n) {
        Map<String, Integer> goalCounts = new HashMap<>();
        
        String[] teams = s.split("\n");
        
        for (String team : teams) {
            goalCounts.put(team, goalCounts.getOrDefault(team, 0) + 1);
        }

        String winningTeam = "";
        int maxGoals = -1;

        for (Map.Entry<String, Integer> entry : goalCounts.entrySet()) {
            if (entry.getValue() > maxGoals) {
                maxGoals = entry.getValue();
                winningTeam = entry.getKey();
            }
        }
        
        return winningTeam;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of goals
        sc.nextLine(); // Consume the remaining newline

        StringBuilder goalsList = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String teamName = sc.nextLine();
            goalsList.append(teamName).append("\n");
        }

        String result = goals(goalsList.toString().trim(), n);
        System.out.println(result);
    }
}
