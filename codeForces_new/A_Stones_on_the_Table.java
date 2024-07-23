import java.util.*;

public class A_Stones_on_the_Table {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        int count =0;
        for (int i =0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            
        }
        System.out.println(count);
        
    }
}