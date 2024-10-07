import java.util.*;

public class pattern18 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        int spaces = 0;
        int star = value;
        for(int i = 1;i<=value;i++){
            for(int j = 1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=star;j++){
                if(i>1&& j>1&& i<=value/2 && j<star){
                    System.out.print("\t");
                } else{
                    System.out.print("*\t");
                }
                
            }
            if(i <=value/2){
                spaces++;
                star-=2;
            } else {
                spaces--;
                star+=2;
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
