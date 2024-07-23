import java.util.*;

public class A_Nearly_Lucky_Number {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        
        long count=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) =='4'  || n.charAt(i) =='7'){
                count++;
            } 
             
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
         else{
            System.out.println("NO");
        }


        
    }
}