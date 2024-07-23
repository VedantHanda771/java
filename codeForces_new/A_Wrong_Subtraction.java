import java.util.*;

public class A_Wrong_Subtraction {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i =1;i<=k;i++){
            if(n%10!=0){
                n = (n-1);
            }
            else {
                n = n/10;
            }
        }
        System.out.println(n);
    }
}