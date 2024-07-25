import java.util.*;

public class A_Translation {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        int count = 0;

        // for (int i=0;i<s.length();i++){
        // for (int j=s2.length()-1;j>=0;j--){
        // if (s.charAt(i)==s2.charAt(j)){
        // count++;
        // }
        // }
        // }

        for (int i = 0, j = s2.length() - 1; i < s.length() && j >= 0; i++, j--) {
            if (s.charAt(i) == s2.charAt(j)) {
                count++;
            }
        }



        if (count == s.length() && s.length()==s2.length()) {
            System.out.println("YES");
        } else if(s.length()!=s2.length()) {
            System.out.println("NO");
        } else{
            System.out.println("NO");
        }
    }
}