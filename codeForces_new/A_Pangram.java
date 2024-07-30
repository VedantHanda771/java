import java.util.*;

public class A_Pangram {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.toLowerCase();

        Set<Character> uniqueCharacters = new HashSet<>();

        for(int i = 0;i<s.length();i++){
            char c  = s.charAt(i);
            if(Character.isAlphabetic(c)){
                uniqueCharacters.add(c);
            }
        }

        if(uniqueCharacters.size() ==26){
            System.out.println("YES");
        } else
        System.out.println("NO");
    }
}