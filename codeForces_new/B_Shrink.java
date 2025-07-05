import java.util.Scanner;

public class B_Shrink {

    public static int[] build(int n) {
        if (n == 3) {
            return new int[] {1, 3, 2};
        }

        int[] arr = new int[n];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = n;

        int k = 3;
        for (int i = 4; i < n; i++) {
            arr[k++] = i;
        }
        arr[n - 1] = 1;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int len = sc.nextInt();

            int[] res = build(len);

            for (int j = 0; j < len; j++) {
                sb.append(res[j]);
                if (j != len - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
        sc.close();
    }
}
