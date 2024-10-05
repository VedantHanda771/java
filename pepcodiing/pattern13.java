import java.util.*;

public class pattern13 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        
        for (int i =0;i<value;i++){
            int icj = 1;
            for(int j = 0;j<=i;j++){
                System.out.print(icj +"\t");
                int icjp1 = icj*(i-j) / (j+1);
                icj = icjp1;
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
