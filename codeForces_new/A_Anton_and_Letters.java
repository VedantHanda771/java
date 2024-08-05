import java.util.*;

public class A_Anton_and_Letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String cleanedInput = s.replaceAll("[{}\\s]","");
        cleanedInput = cleanedInput.replaceAll("[,\\s]","");
        
        Set<Character> uniqueLetters = new HashSet<>();

        for (int i =0; i<cleanedInput.length(); i++){
            uniqueLetters.add(cleanedInput.charAt(i));
        }

        System.out.println(uniqueLetters.size());
    }
}