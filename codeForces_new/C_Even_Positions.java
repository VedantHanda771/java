import java.util.Scanner;

public class C_Even_Positions {

    public static void main(String[] args) {//main function
        Scanner sc = new Scanner(System.in);//inpul liti
        long n = sc.nextLong();//in
        sc.nextLine(); // Consume the newline character left after nextLong()

        int out = 3;//defined
        int in = 1;//defined
        int cost = 0;//defined

        for (int i = 0; i < n; i++) {// main for funtinon
            long a = sc.nextLong();
            sc.nextLine(); // Consume the newline character left after nextLong()
            String s = sc.nextLine();

            // Check each character in the string
            for (char c : s.toCharArray()) { //2nd main
                if (c == '(') {
                    cost += out;
                } else if (c == ')') {
                    cost += in;
                } else{
                    cost += 0;
                }
            }
            System.out.println(cost);
            cost = 0;
        }

        // System.out.println(cost);

        //end
    }
}
