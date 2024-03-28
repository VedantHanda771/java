import java.util.*;

public class bonus {

    // public static int gcd(int a, int b){
        
    //     if(a==0){
    //         return b;
    //     } else if(b==0){
    //         return a;
    //     } else if(a>b) {
    //         return gcd(a-b,b);
    //     }else return gcd(a,b-a);
        

    // }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a =0, b=1;
        System.out.print(a+" ");
        for (int i=2;i<=n;i++){
            System.out.print(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
        }

        System.out.println();
    }
    
}
