import java.util.*;


public class incRecurion {
    // burteforce
    // public static void int1(int value, int start) {
    //     // format of vh771
    //     // code writing 
    //     if(value == start){
    //         System.out.println(start);
    //         return;
    //     }
    //     else{
    //         System.out.println(start);
    //         int1(value,start+1);
    //     }

        
    // }

    // optimal
    public static void int1(int value) {
        // format of vh771
        // code writing 
        if(value == 0){
            return;
        }
        int1(value-1);
        System.out.println(value);
        
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int1(n);
        
    }
}
