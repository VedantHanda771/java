import java.util.*;

public class pattern16 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        int space = 2*value -3;
        int star = 1;
        for(int i =1;i<=value;i++){
            int val = 1;
            for(int j = 1;j<=star;j++){
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1;j<=space;j++){
                System.out.print("\t");
            }
            if(i==value){
                star--;
                val--;
            }
            for(int j = 1;j<=star;j++){
                val--;
                System.out.print(val+"\t");
            }
            
        
            space-=2;
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
