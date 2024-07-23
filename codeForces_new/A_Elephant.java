import java.util.*;

public class A_Elephant {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println(n/5);
        } else {
            System.out.println(n/5+1);
        }
    }
}