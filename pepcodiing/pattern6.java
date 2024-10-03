import java.util.*;

public class pattern6 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        int st = value /2 +1;
        int sp = 1;
        for(int i = 1;i<=value;i++){
            for(int j = 0;j<=st;j++){
            System.out.print("*\t");
            }
            for(int j = 0;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j = 0;j<=st;j++){
            System.out.print("*\t");
            }
            if(i<=value/2){
                sp +=2;
                st--;
            } else{
                sp -=2;
                st++;
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
