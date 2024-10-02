import java.util.*;

public class pattern4 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        int space = 0;
        int star = value;
        for(int i = value;i>=1;i--){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=star;j++){
                System.out.print("* ");
            }
            space++;
            star--;
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
