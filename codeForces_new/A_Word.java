import java.util.*;

public class A_Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int character = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                character++;
            }
        }
        int remaing = s.length() - character;
        if (character > remaing) {
            System.out.println(s.toUpperCase());
        } else
            System.out.println(s.toLowerCase());

    }
}