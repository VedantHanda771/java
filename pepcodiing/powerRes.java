import java.util.*;

public class powerRes {
    public static int int2(int n, int m){
        // format of vh771 
        // code writing
        if(m == 0){
            return 1;
        }
        return n * int2(n,m-1);
       
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = int2(in1, in2);
        System.out.println(result);
    }
}
