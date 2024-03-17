import java .util.*;
public class conditions{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int button=sc.nextInt();
        // int b=sc.nextInt();
        // if (number%2==0){
        //     System.out.println("The given number is even");
        // }else {
        //     System.out.println("The given number is odd");
        // }

        // if (a>b) {
        //     System.out.println("a is greter than b");
        // }
        // else{
        //     if(a<b){
        //         System.out.println("a is less than b");
        //     }
        //     else {
        //         System.out.println("a is equal to b");
        //     }
        // }/

        // else if statment
        // if(a>b){
        //     System.out.println("a is greater than b");
        // }
        // else if(a<b){
        //     System.out.println("a is smaller than b");
        // }
        // else{
        //     System.out.println("a is equla to b");
        // }

        switch(button){
            case 1: System.out.println("Hello!");
            break;
            case 2: System.out.println("Nameste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid Button");
        }
    }

}