import java.util.*;

public class wayTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.length() <= 10) {
                ans.add(s);
            } else {
                String abbreviated = "";
                abbreviated += s.charAt(0);
                abbreviated += s.length() - 2;
                abbreviated += s.charAt(s.length() - 1);
                ans.add(abbreviated);
            }
        }

        for (String str : ans) {
            System.out.println(str);
        }

        scanner.close();
    }
}
