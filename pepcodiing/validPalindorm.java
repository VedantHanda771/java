import java.util.*;


public class validPalindorm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = validPalindorme(s);
        System.out.println(result);
    }


    public static boolean validPalindorme(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            end--; start++;
        }
        return true;
    }
}
