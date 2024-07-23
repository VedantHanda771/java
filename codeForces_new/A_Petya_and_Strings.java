import java.util.*;/**
 * A_Petya_and_Strings
 */
public class A_Petya_and_Strings {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        s=s.toLowerCase();
        String s2=sc.nextLine();
        s2=s2.toLowerCase();
        int a=0;
        int b=0;
        for (int i=0;i<s.length();i++){
            if(s.compareTo(s2) <0){
                a++;
            } else if(s.compareTo(s2)>0){
                b++;
            }
        }
        if(a==b){
            System.out.println(0);
        } else if(a>b){
            System.out.println(-1);
        } else{
            System.out.println(1);
        }
        
        
    }
}