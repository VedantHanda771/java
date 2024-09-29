import java.util.*;


public class subString {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        for (int i = 0; i<s.length();i++){
            for (int j = i+1; j <=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
