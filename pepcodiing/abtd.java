import java.util.Scanner;

public class abtd {
    public static int int2(int n, int m){
        // format of vh771 
        // code writing
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%10;
            n = n/10;
            rv +=dig *p;
            p = p*m;
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
