import java.util.Scanner;

class main2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int testCase = 0; testCase < t; testCase++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int k = sc.nextInt();
                int rv = 0;
                
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                
                for (int i = 0; i < n; i++) {
                    if (arr[i] == k) {
                        rv = i;
                        break;
                    }
                }
                System.out.println(rv);
            }
        }
    }
}
