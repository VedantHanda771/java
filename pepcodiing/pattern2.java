import java.util.*;

public class pattern2 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        for (int i = value;i>0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return value;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = int1(n);
        // System.out.println(result);
    }
}
