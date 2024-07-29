import java.util.*;

public class A_Hulk {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for (int i =1 ; i<=n;i++){
            if(i%2==0 && i!=n){
                System.out.print("I love that ");
            } else if(i==n && n%2!=0){
                System.out.print("I hate it");
            } else if(i==n && n%2==0){
                System.out.print("I love it");
            } if(i%2!=0 && i!=n){
                System.out.print("I hate that ");
            }
        }
    }
}