import java.util.*;

public class findChars {

    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = count(s);
        System.out.println(result);
    }

    public static String count(String s){
        int upper = 0;
        int lower = 0;
        int num = 0;
        int special = 0;
        int len = s.length();
        for(int i = 0;i<len;i++){
            if(Character.isUpperCase(s.charAt(i))){
                upper++;
            }
            if(Character.isLowerCase(s.charAt(i))){
                lower++;
            }
            if(Character.isDigit(s.charAt(i))){
                num++;
            }
            if(!Character.isLetterOrDigit(s.charAt(i))){
                special++;
            }
        }
        String res = "upper->" + upper +" lower->" + lower+ " num->"+ num+" special->"+ special;
        return res;
    }
}