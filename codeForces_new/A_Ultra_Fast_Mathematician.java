import java.util.*;

public class A_Ultra_Fast_Mathematician {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s2 = sc.nextLine();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s2.charAt(i)){
                System.out.print('0');
            } else
            System.out.print('1');
        }


    }
}