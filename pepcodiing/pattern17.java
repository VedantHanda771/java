import java.util.*;

public class pattern17 {
    public static int int1(int value) {
        // format of vh771
        // code writing
        int spaces = value/2;
        int stars = 1;
        for(int i = 1;i<=value;i++){
            for(int j = 1;j<=spaces;j++){
                if(i==(value/2)+1){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
                
            }
            for(int j = 1;j<=stars;j++){
                System.out.print("*\t");
                
            }

            if(i<=value/2){
                stars++;
            } else {
                stars--;
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
