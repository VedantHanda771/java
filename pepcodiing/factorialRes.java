import java.util.*;

public class factorialRes {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        if(value ==1){
            return 1;
        }
        
        return value * int1(value - 1);
       
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = int1(n);
        System.out.println(result);
    }
}
