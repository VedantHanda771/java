import java.util.*;

public class dtab {
    public static int int2(int n, int m){
        // format of vh771 
        // code writing
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%m;
            n = n/m;
            rv += dig *p;
            p = p*10;
        }
        return rv;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = int2(in1, in2);
        System.out.println(result);
    }
}
