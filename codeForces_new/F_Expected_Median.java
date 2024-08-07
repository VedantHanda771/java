import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F_Expected_Median {

    static final long MOD = 1_000_000_007;
    static final int MAX_N = 100_001;
    static long[] factorial = new long[MAX_N + 1];
    static long[] invFactorial = new long[MAX_N + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long t = Long.parseLong(st.nextToken());

        // Precompute factorials and inverse factorials
        factorial[0] = 1;
        for (int i = 1; i <= MAX_N; ++i) {
            factorial[i] = factorial[i - 1] * i % MOD;
        }
        invFactorial[MAX_N] = modInverse(factorial[MAX_N], MOD);
        for (int i = MAX_N - 1; i >= 0; --i) {
            invFactorial[i] = invFactorial[i + 1] * (i + 1) % MOD;
        }

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long[] array = new long[(int)n];
            long[] prefixSum = new long[(int)n + 1];
            prefixSum[0] = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; ++i) {
                array[i] = Long.parseLong(st.nextToken());
                prefixSum[i + 1] = prefixSum[i] + array[i];
            }

            long medianIndex = k / 2;
            long result = 0;
            long zeroCount = n - prefixSum[(int)n];
            long oneCount = prefixSum[(int)n];

            for (int i = 0; i < n; ++i) {
                if (array[i] == 1) {
                    long preZeroCount = zeroCount + prefixSum[i];
                    long postOneCount = oneCount - prefixSum[i + 1];

                    long value = (comb(preZeroCount, medianIndex) * comb(postOneCount, medianIndex)) % MOD;
                    result = (result + value) % MOD;
                }
            }

            System.out.println(result);
        }
    }

    static long modInverse(long a, long m) {
        return binaryExponentiation(a, m - 2, m);
    }

    static long binaryExponentiation(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }

    static long comb(long n, long r) {
        if (r < 0 || n < 0 || n < r) return 0;
        return factorial[(int)n] * invFactorial[(int)r] % MOD * invFactorial[(int)(n - r)] % MOD;
    }
}
