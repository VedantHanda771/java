import java.util.*;

public class exercise1 {


    // public static int average(int a, int b, int c){
    //     int avg= (a+b+c)/3;
    //     return avg;

    // }

    public static int sum(int n){
        int odd =0;
        for(int i=1;i<=n;i+=2){
            odd+=i;    
        }
        return odd;
        

    }
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        //  System.out.println(average(a,b,c));
        int n=sc.nextInt();
        System.out.println(sum(n));
    
    }


    
}
