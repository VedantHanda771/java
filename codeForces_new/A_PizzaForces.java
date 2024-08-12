import java.util.*;

public class A_PizzaForces {

    void sol(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n-->0){
            long a = sc.nextLong();
            if(a <= 4){
            System.out.println(15);}
            else
            System.out.println(((a+1)/2)*5);
        }
    }

    public static void main(String[] args) {
        new A_PizzaForces().sol();
    }
}