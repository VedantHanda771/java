import java.util.*;

public class pattern14 {
    public static int int1(int value) {
        // format of vh771
        // code writing
        for (int i = 1; i<=10;i++){
            int v = value * i;
            System.out.println(value + " * " + i + " = " + v);
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
