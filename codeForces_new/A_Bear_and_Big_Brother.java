import java.util.*;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int large=0;
        while(a<=b){
            
            a= a*3;
            b= b*2;
            large++;
            if(a>b){
                System.out.println(large);
            }

        }
        
    }

}