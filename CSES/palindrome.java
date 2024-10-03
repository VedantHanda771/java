import java.util.*;


public class palindrome {
    public static long int2(long n, long m){
        // format of vh771 
        // code writing
        String s= "";
        Random r = new Random();
        for(long i = 1;i<=m;i++){
            s = s + "a";
        }
        // System.out.print(s);
        
        for(long i = 0;i<(n-m);i++){
            char randomChar = (char) ('b' + (i%25));
            s = s+ randomChar;
        }
        System.out.print(s);

        return m;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        long in1 = sc.nextLong();
        long in2 = sc.nextLong();
        long result = int2(in1, in2);
        // System.out.println(result);
    }
}
