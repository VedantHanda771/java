import java.util.*;/**
 * A_Word_Capitalization
 */
public class A_Word_Capitalization {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        //s.charAt index to be changed s.substring to beign the remaing string
        s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        
        
        System.out.println(s);
    }

    
}