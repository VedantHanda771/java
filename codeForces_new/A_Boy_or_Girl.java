import java.util.*;

public class A_Boy_or_Girl {

    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        HashSet<Character> l = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
            
        }
        if(l.size() % 2== 0){
            System.out.println("CHAT WITH HER!");
        } else{
            System.out.println("IGNORE HIM!");
        }

    }
}