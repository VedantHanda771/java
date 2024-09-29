import java.util.*;

public class primeFactorization {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        for (int div = 2;div * div <=value;div++){
            while (value % div == 0){
                value /= div;
                System.out.print(div + " ");
            }
        }
        if(value !=1){
            System.out.print(value);
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
