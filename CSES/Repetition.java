import java.util.Scanner;

public class Repetition {
    public static long longestRepetition(String dnaSequence) {
        long maxLength = 1; 
        long currentLength = 1;


        for (int i = 1; i < dnaSequence.length(); i++) {
            if (dnaSequence.charAt(i) == dnaSequence.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1; 
            }
        }

       
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String dnaSequence = sc.next();
        
        
        long result = longestRepetition(dnaSequence);
        
       
        System.out.println(result);
        
       
    }
}
