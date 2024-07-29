import java.util.*;

public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int [] var = new int[4];
        long buy=0;
        for (int i =0;i<var.length;i++){
            var[i]=sc.nextInt();
        }
        for (int i =0;i<var.length-1;i++){
            if(var[i]==var[i+1]){
                buy++;
            }
        }
        System.out.println(buy);
    }
}