import java.util.*;

public class A_False_Alarm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int currentPosition = 0;
            boolean btnPressed = false;
            boolean isPossible = true;

            while (currentPosition < n) {
                if (arr[currentPosition] == 0) {
                    currentPosition++;
                } else if (!btnPressed) {
                    btnPressed = true;
                    for (int j = currentPosition; j < Math.min(n, currentPosition + x); j++) {
                        if (arr[j] == 1) {
                            arr[j] = 0;
                        }
                    }
                    currentPosition++;
                } else {
                    isPossible = false;
                    break;
                }
            }

            System.out.println(isPossible ? "YES" : "NO");
        }

        sc.close();
    }
}
