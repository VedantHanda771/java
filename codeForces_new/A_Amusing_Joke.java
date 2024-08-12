import java.util.*;

public class A_Amusing_Joke {

    void letters() {
        Scanner in = new Scanner(System.in);

        // Read input strings
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();

        // Convert strings to character arrays and sort them
        char[] ori1 = (a + b).toCharArray();
        char[] ori2 = c.toCharArray();
        
        Arrays.sort(ori1);
        Arrays.sort(ori2);
        
        // Convert sorted character arrays back to strings
        String sot1 = new String(ori1);
        String sot2 = new String(ori2);
        
        // Compare the sorted strings
        if (sot1.equals(sot2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Print sorted strings for debugging
        // System.out.println(sot1);
        // System.out.println(sot2);

        in.close();
    }

    public static void main(String[] args) {
        new A_Amusing_Joke().letters();
    }
}
