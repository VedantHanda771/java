import java.util.*;

public class A_In_Search_of_an_Easy_Problem {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i= 0; i<n;i++){
            int x=sc.nextInt();
            if(x==1){
                count++;
            }
        }
        if (count>0){
            System.out.println("HARD");
        } else
        System.out.println("EASY");
    }
}