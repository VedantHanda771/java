import java.util.*;


public class pythagran {
    public static int int2(int n, int m,  int k) {

        // format of vh771 
        // code writing
        int max = n;
        if(m>=max){
            max = m;
        }
        if(k>=max){
            max = k;
        }

        if(max == n){
            boolean flag = ((m * m + k * k) == (n*n));
            System.out.println(flag);
        } else if(max == m ){
            boolean flag = ((n * n + k* k) == (m* m));
            System.out.println(flag);
        } else {
            boolean flag = ((n * n + m* m ) == (k* k));
            System.out.println(flag);
        }
        return 1;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();
        int result = int2(in1, in2, in3);
        // System.out.println(result);
    }
}
