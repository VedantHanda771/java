import java.util.*;

public class pattern20 {
    public static int int1(int value) {
        // format of vh771
        // code writing
        for(int i = 1;i<=value;i++){
            for(int j =1;j<=value;j++){
                if(j == 1 || j == value){
                    System.out.print("*\t");
                } else if(i>value/2 && (i == j || i +j == value +1)){
                    System.out.print("*\t");
                } else {
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
