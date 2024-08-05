import java.util.*;

public class A_Candies_and_Two_Sisters {

    void candles(){
        Scanner sc = new Scanner(System.in);

        long n =sc.nextLong();
        for(int i=0;i<n;i++){
            long b=sc.nextLong();
            if(b%2==0){
                System.out.println((b-1)/2);
            } else
            System.out.println(b/2);

        }

        sc.close();
    }

    public static void main(String[] args) {
        new A_Candies_and_Two_Sisters().candles();
    }
}