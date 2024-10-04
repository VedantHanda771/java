import java.util.*;

public class pattren11 {
    public static int int1(int value) {
        // format of vh771
        // code writing
        int count = 1; 
        for(int i =1;i<=value;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(count + "\t");
                count++;
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
