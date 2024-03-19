import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p= sc.nextInt();
        if(p%1==0 && p%p==0 && p%2!=0 && p%3!=0 && p%5!= 0){
            System.out.println( "The number is a Prime Number");
        } else{
            System.out.println( "The number is not a Prime Number");
        }

    }
    
}
