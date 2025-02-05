import java.util.*;

public class A_Game_with_Integers {

    public static void main(String agrs[]){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            int n = scanner.nextInt();
                   
            String answer = tank(n);
            System.out.println(answer);
        }
        scanner.close();
    }

    public static String tank(int n){
        long turns= 0;
        if(n%3 == 0){
            return "Second";
        } else 
            return "First";
    }
}