import java.util.*;

public class A_Dubstep {

    public static String str1(String s){
        // format of vh771
        // code writing
        String dub = s.replace("WUB" , " ");
        dub = dub.replaceAll("\\s+" , " ");
        System.out.println(dub.trim());
        return s;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = str1(s);
        // System.out.println(result);
    }
}
