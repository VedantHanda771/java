import java.util.*;


public class pattern15 {
    public static int int1(int value) {
        // format of vh771
        // code writing
        int space = value/2;
        int star = 1;
        int val=1;
        for(int i = 1;i<=value;i++){
            for(int j = 1; j<=space;j++){
                System.out.print("\t");
            }
            int cval = val;
            for(int j = 1;j<=star;j++){
                System.out.print(cval+"\t");
                if(j<=star/2 ){
                    cval++;
                } else{
                    cval--;
                }
            }
            
            if(i<=value/2){
                space--;
                star+=2;
                val++;
            } else{
                space++;
                star-=2;
                val--;
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