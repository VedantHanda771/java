import java.util.*;

public class shortestPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = shortestPalindrome(s);
                System.out.println(result);
        }
        
        
        
        public static String shortestPalindrome(String s) {
            String t = new StringBuilder(s).reverse().toString();
            for(int i = 0 ;i<t.length();i++){
                if(s.startsWith(t.substring(i))){
                    return t.substring(0, i) +s;
                }
            }
            
            return t+s;
        }
}
