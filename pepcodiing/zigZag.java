import java.util.*;

public class zigZag {
    public static void int1(int value) {
        // format of vh771
        // code writing 
        if(value == 0){
            return;
        }
        System.out.print(value + " ");
        int1(value-1);
        System.out.print(value + " ");
        int1(value-1);
        System.out.print(value + " ");
        
    }
    // Tree explanation
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int1(n);
        // System.out.println(result);
    }
}
