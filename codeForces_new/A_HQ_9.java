import java.util.*;

public class A_HQ_9 {

    public static String str1(String s){
        // format of vh771
        // code writing
        if(s.contains("H") || s.contains("Q") || s.contains("9")){
            return "YES";
        } else {
            return "NO";
        }
        // return s;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = str1(s);
        System.out.println(result);
    }
}