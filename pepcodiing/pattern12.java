import java.util.*;

public class pattern12 {
    
    public static int int1(int value) {
        // format of vh771
        // code writing 
        int start = 0;
        int second = 1;
        for(int i = 1;i<=value;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(start + "\t");
                int third = start + second;
                start  = second;
                second  = third;
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
