import java.util.*;

public class A_Raising_Bacteria {

    public static int int1(int value) {
        // format of vh771
        // code writing 
        int count = 0;
        while (value > 0 ){
            count += (value & 1);
            value >>=1;
        }
        return count;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(int1(n));
    }
}