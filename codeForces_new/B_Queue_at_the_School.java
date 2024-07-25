import java.util.*;

public class B_Queue_at_the_School {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char [] c = s.toCharArray();
        

        while(t!=0){
            
        for (int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='B' && s.charAt(i+1)=='G'){
                char temp = c[i];
                c[i]=c[i+1];
                c[i+1]=temp;

            }
            
        }
        s = new String(c);
        
        
        t--;
        
        }
        System.out.println(s);
        
        
        
    }
}