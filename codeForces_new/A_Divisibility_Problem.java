import java.util.*;

public class A_Divisibility_Problem {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans=a%b;
            if(a<b)
            System.out.println(b-a);
            else if(a%b==0)
            System.out.println(0);
            else
            System.out.println(b-ans);
            
            
            
            
            
        }
        
    }
}