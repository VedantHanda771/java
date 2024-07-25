import java.util.*;

public class A_Burenka_Plays_with_Fractions {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t!=0){

            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            long m1=(long)a*d;
            long m2=(long)b*c;

        if(m1==m2){
            System.out.println(0);
        } else if (m1 == 0 || m2 == 0 || (m1 % m2 == 0 && m2 != 0) || (m2 % m1 == 0 && m1 != 0)) {
            System.out.println(1);
        }  else
        System.out.println(2);
        t--;
        
    }
    }
}