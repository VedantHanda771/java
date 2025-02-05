import java.util.*;

public class leetcode_459 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = repeatedSubstringPattern(s);
        System.out.println(result);
    }

    public static boolean repeatedSubstringPattern(String s){
        String dou = s+s;
        return dou.substring(1,dou.length()-1).contains(s);
    }
}