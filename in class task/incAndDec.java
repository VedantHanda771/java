import java.util.*;

public class incAndDec {
    public static void int1(int value) {
        // format of vh771
        // code writing 
        if(value == 0){
            return;
        }
        System.out.println(value);
        int1(value-1);
        System.out.println(value);
        
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int1(n);
        // System.out.println(result);
    }
}
