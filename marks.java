
import java.util.*;
public class marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        do{
            switch (n){
                case 1: System.out.println("Enter Marks : ");
                float Marks=sc.nextFloat();
                if(Marks>=90){
                    System.out.println("Good Marks");
                } else if(Marks>=60 && Marks>=89){
                    System.out.println(  "Average Marks");
                }else{
                    System.out.println("need  to study more");
                }
                case 0: System.out.println("Bye  Bye!"); 
                break;
            }            
        } while(n!=0);
        

    }
}