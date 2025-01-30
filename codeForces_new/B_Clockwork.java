import java.util.Scanner;

public class B_Clockwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        while (tests-- > 0) {
            int size = input.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            boolean ok = true;
            for (int i = 0; i < size; i++) {
                if (arr[i] <= i * 2 || arr[i] <= (size - i - 1) * 2) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
        input.close();
    }
}
