import java.util.*;

public class fibodp {
     public static int int1(int value,int[] qb){
        // format of vh771
        // code writing 
        if(value == 0 || value == 1){
            return value;
        }
        if(qb[value] != 0){
            return qb[value];
        }
        int fbn1 = int1(value-1,qb);
        int fbn2 = int1(value-2,qb);
        int fbn = fbn1 + fbn2;

        qb[value] = fbn;
        return fbn;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = int1(n, new int[n+1]);
        System.out.println(result);
    }
}
