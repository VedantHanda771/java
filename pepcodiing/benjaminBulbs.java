import java.util.*;

public class benjaminBulbs {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        for (int i = 1; i * i <= value; i++){
            System.out.println(i * i);
        }
        return 1;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = int1(n);
        // System.out.println(result);
    }
}
