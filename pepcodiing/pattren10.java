import java.util.*;

public class pattren10 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        int outterSpace = value/2;
        int innerSpace = -1;
        for(int i = 1;i<=value;i++){
            for(int j = 1;j<=outterSpace;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j = 1;j<=innerSpace;j++){
                System.out.print("\t");
            }
            if(i>1 && i<value){
                System.out.print("*\t");
            }
            if(i<=value/2){
                outterSpace--;
                innerSpace +=2;
            } else{
                outterSpace++;
                innerSpace -=2;
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
