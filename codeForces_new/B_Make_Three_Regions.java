import java.util.Scanner;

public class B_Make_Three_Regions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input

        int t = sc.nextInt();//input
        sc.nextLine(); // Consume the remaining newline
        
        while (t-- > 0) {//input while
            int n = sc.nextInt();//input whi
            sc.nextLine(); // Consume the remaining newline
            String a = sc.nextLine();//input a
            String b = sc.nextLine();//input b

            // Check if there is any '.' in both strings
            boolean hasDot = false; //input bol
            for (int i = 0; i < n; i++) { //input for
                if (a.charAt(i) == '.' || b.charAt(i) == '.') { //input
                    hasDot = true; //input
                    break;//input
                }
            }

            if (!hasDot) {//input
                System.out.println(0); //input
                continue;//input
            }

            int ans = 0; //input
            int[] count = new int[n + 2]; //input
            int cur = 0;//input

            // Calculate the cumulative count of '.' up to each position
            for (int i = 0; i < n; i++) {//input
                if (a.charAt(i) == '.' || b.charAt(i) == '.') {
                    cur++; //input
                }
                count[i + 1] = cur; // count[i + 1] represents the number of '.' up to and including index i
            }

            // Check the patterns
            for (int i = 1; i < n - 1; i++) { //input
                int left = count[i]; // Number of '.' in the left side
                int right = count[n] - count[i + 1]; // Number of '.' in the right side

                if (a.charAt(i) == '.' && b.charAt(i - 1) == 'x' && b.charAt(i + 1) == 'x' && left > 0 && right > 0 && b.charAt(i) == '.') {
                    ans++; //input
                }
                if (b.charAt(i) == '.' && a.charAt(i - 1) == 'x' && a.charAt(i + 1) == 'x' && left > 0 && right > 0 && a.charAt(i) == '.') {
                    ans++; //input
                }
            }

            System.out.println(ans);//input answer
        }

        //end
    }
}
