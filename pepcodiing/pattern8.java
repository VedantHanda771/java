import java.util.*;
public class pattern8 {
    public static int int1(int value) {
        // format of vh771
        // code writing
        
        // brute force
        // int sp = value-1;
        // int st = 1;
        // for(int i = 1;i<=value;i++){
        //     for(int j = 1;j<=sp;j++){
        //         System.out.print("\t");
        //     }
        //     for(int j = 1;j<=st;j++){
        //         System.out.print("*\t");
        //     }
        //     sp--;
        //     System.out.println();
        // }

        // optimal
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                if(i+j == value+1){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();

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
