import java.util.*;

public class pattren2 {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        // butterfly pattren
        // for(int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces=2*(n-i);
        //     for (int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=n;i>=1;i--){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces=2*(n-i);
        //     for (int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // sharme vala
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            int star=2*(n-i);
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
