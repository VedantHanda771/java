import java.util.*;


public class stringBuilder {

    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Vedant");

        // System.out.println(sb.charAt(3));
        // sb.setCharAt(1,'i');

        // sb.insert(0,'e');
        // sb.delete(0,1);
        // sb.append(" Handa");
        // System.out.println(sb);
        // System.out.println(sb.length());


        for (int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);

            
        }

        System.out.println(sb);

    }
    
}
