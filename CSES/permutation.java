import java.util.*;


public class permutation {
    public static long int1(long value) {
        // format of vh771
        // code writing 
        if(value==2 || value == 3){
            System.out.println("NO SOLUTION");
        } else{
            StringBuilder s = new StringBuilder();
            for(int i = 2;i<=value;i += 2){
                s.append(i + " ");
            }
            for(int i = 1;i<=value;i+=2){
                s.append(i + " ");
            }
            System.out.println(s.toString().trim());
        }
        return value;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = int1(n);
        // System.out.println(result);
    }
}
