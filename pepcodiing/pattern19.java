import java.util.*;

public class pattern19 {
    public static int int1(int value) {
        // format of vh771
        // code writing 
        for(int i =1;i<=value;i++){
            for(int j=1;j<=value;j++){
                if(i==1){
                    if(j == value|| j <= value/2 + 1){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } else if(i <=value/2){
                    if(j == value|| j == value/2 + 1){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } else if(i == value/2+1){
                    System.out.print("*\t");

                } else if(i<value){
                    if(j == 1 || j == value/2 + 1){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if(j == 1 || j >= value/2 +1){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
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
