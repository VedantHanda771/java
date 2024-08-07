import java.util.*;

public class D_Slavic_s_Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline character
        
        while (T-- > 0) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            
            if (canBeSubsequence(s, t)) {
                System.out.println("YES");
                System.out.println(replaceQuestionMarks(s, t));
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }

    private static boolean canBeSubsequence(String s, String t) {
        int tIndex = 0;
        for (char c : s.toCharArray()) {
            if (tIndex < t.length() && (c == t.charAt(tIndex) || c == '?')) {
                tIndex++;
            }
        }
        return tIndex == t.length();
    }

    private static String replaceQuestionMarks(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        int tIndex = 0;
        
        // Replace '?' to ensure t is a subsequence
        for (int i = 0; i < sb.length(); i++) {
            if (tIndex < t.length() && (sb.charAt(i) == '?' || sb.charAt(i) == t.charAt(tIndex))) {
                if (sb.charAt(i) == '?') {
                    sb.setCharAt(i, t.charAt(tIndex));
                }
                tIndex++;
            }
        }
        
        // Replace remaining '?' with 'a'
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '?') {
                sb.setCharAt(i, 'y');
            }
        }
        
        return sb.toString();
    }
}
