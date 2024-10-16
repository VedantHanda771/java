import java.util.Scanner;

public class abtab {
    public static int d2ab(int n, int m){
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
    public static int ab2d(int n, int m){
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
    public static int int2(int n, int bg, int btc){
        // format of vh771 
        // code writing
        int dec = ab2d(n,bg);
        int dc = d2ab(dec,btc);
        
        return dc;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();
        int result = int2(in1, in2,in3);
        System.out.println(result);
    }
}
