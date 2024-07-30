import java.util.Scanner;

public class A_Strong_Password { //first one

    public static int calculateTime(String s) { // mai vala
        int time = 2; // Time to type the first character
        for (int i = 1; i < s.length(); i++) {//main forur
            if (s.charAt(i) == s.charAt(i - 1)) {//man iff
                time += 1; // Same as previous character
            } else {//main else
                time += 2; // Different from previous character
            }
        }
        return time;//time returnded
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();//in lita
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {//while loop
            String s = scanner.nextLine();//string
            String bestPassword = "";//sabtoh vadia 
            int maxTime = -1;//max kina hu e

            // Iterate over all positions and all characters
            for (int i = 0; i <= s.length(); i++) {//for vala
                for (char c = 'a'; c <= 'z'; c++) {//char vaste for
                    String newPassword = s.substring(0, i) + c + s.substring(i);
                    int newTime = calculateTime(newPassword);//naca pass
                    if (newTime > maxTime) {//if vala
                        maxTime = newTime;
                        bestPassword = newPassword;//best 
                    }
                }
            }

            System.out.println(bestPassword);//output
        }

        // scanner.close();
    }
}
