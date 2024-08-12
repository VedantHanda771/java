import java.io.*;
import java.util.StringTokenizer;

public class C_Vasilije_in_Cacak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long S_min = k * (k + 1) / 2;
            long total_sum = n * (n + 1) / 2;
            long subtract_sum = (n - k) * (n - k + 1) / 2;
            long S_max = total_sum - subtract_sum;

            if (S_min <= x && x <= S_max) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }

        pw.flush(); // Ensure all output is written
        pw.close();
    }
}
