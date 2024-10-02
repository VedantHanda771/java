import java.util.*;


public class pattern3 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        int space = value -1;
        int star = 1;
        for(int i= 1;i<= value ;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" \t");
            }
            for(int j =1;j<=star;j++){
                System.out.print("*\t");
            }
            space--;
            star++;
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
