import java.util.*;

public class A_Vanya_and_Fence {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int count=0;

        for (int i=0;i<n;i++){
            int x = sc.nextInt();
            if(x>f){
                count+=2;
            } else
            count+=1;
        }
        System.out.println(count);
    }
}