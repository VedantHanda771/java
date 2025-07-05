import java.util.*;

public class TowerOfHanoi {
    public static void move(int n, char source, char dest, char aux){
        if(n == 1){
            System.out.println("Move disk 1 from rod " + source + " to rod " + dest);
        }

        move(n-1, source, aux,dest);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + dest);
        move(n-1, aux,dest,source);
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        move(n,'A','B','C');
    }
}
