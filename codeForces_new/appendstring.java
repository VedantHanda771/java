import java.util.*;

public class appendstring {
    public static String appended(String s1, String s2) {
        char ch[] = s1.toCharArray();
        char sh[] = s2.toCharArray();
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < ch.length && i<sh.length) {
            s.append(ch[i]);
            s.append(sh[i]);
            i++;
        }
        while (i < ch.length) {
            s.append(ch[i]);
            i++;
        }
        while (i < sh.length) {
            s.append(sh[i]);
            i++;
        }
        return s.toString();
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();

        String result = appended(s, s2);
        System.out.println(result);

    }

}