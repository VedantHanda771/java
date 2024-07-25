import java.util.*;

public class A_George_and_Accommodation {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for (int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b-a>=2){
                count++;
            }
        }

        System.out.println(count);
    }
}