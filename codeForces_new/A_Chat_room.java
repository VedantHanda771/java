import java.util.Scanner;

public class A_Chat_room {

    private static final String TARGET = "hello";

    
    public static String canSayHello(String s) {
        int j = 0; 

       
        for (char ch : s.toCharArray()) {
            if (ch == TARGET.charAt(j)) {
                j++; 
                if (j == TARGET.length()) { 
                    return "YES";
                }
            }
        }
        return "NO"; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine(); // Read input

        String result = canSayHello(input);
        System.out.println(result); 

        scanner.close();
    }
}
