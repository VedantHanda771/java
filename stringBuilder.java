import java.util.*;


public class stringBuilder {

    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Vedant");

        System.out.println(sb.charAt(3));
        sb.setCharAt(1,'i');

        sb.insert(0,'e');
        sb.delete(0,1);
        sb.append(" Handa");
        System.out.println(sb);
        System.out.println(sb.length());

    }
    
}
