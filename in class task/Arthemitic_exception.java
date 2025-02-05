import java.util.*;

public class Arthemitic_exception {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a/b;
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("not allowed");
            throw new ArithmeticException();
        }
    }
}
