import java.util.*;

public class primeSieve {

    // what is Prime Sieve?
    // the sieve of erathsthenese is a highly efficient algo 
    // used to find prime number sin a given limit and it eliminats non prime numbers 
    // steps
    // Define the range 
    // initilize the boolean array whoes size is n+1
    // initize all the elements to true (prime) and isPrime[0] = isPrime[1] = false b/c zero and one are not prime 
    // mark non prime numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        System.out.println(sieve(n));

    }

    public static List<Integer> sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j = i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for(int i = 2;i<=n;i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }

        return primes;

    }
    
}
