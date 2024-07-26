import java.util.Scanner;

public class E_Decode {
    private static final long MOD = 1_000_000_007L; //chja yyar 

    public static void main(String[] args) { //bhai nhi e
        Scanner scanner = new Scanner(System.in);//bata fir eda rre ga

        int testCases = scanner.nextInt();//ds na
        scanner.nextLine();  // Consume the newline character

        while (testCases-- > 0) {//while na
            String binaryString = scanner.nextLine();//scanner na

            int n = binaryString.length();//binary na
            long[] prefixSum = new long[n + 1];//hena
            long[] count = new long[2 * n + 2];//haina 3

            // Calculate prefix sum
            for (int i = 0; i < n; i++) {//montena 3
                prefixSum[i + 1] = prefixSum[i] + (binaryString.charAt(i) == '1' ? 1 : -1);//kal ki karna e
            }

            // Initialize count array
            for (int i = 0; i < 2 * n + 2; i++) { //kid ae
                count[i] = 0;//ki karda e
            }

            long answer = 0;
            for (int j = 1; j <= n; j++) {//dsde yar
                // Update count array
                count[(int) (prefixSum[j - 1] + n)] += j;//ki chan ae tu

                // Calculate answer
                answer = (answer + count[(int) (prefixSum[j] + n)] * (n - j + 1)) % MOD;//mai iki kara t
            }

            System.out.println(answer);//k kush nakara 
        }

        //end
    }
}
