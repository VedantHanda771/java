import java.util.Scanner;//scanner bulaaya

public class D_Fun {//main class
    public static void main(String[] args) { //main function
        Scanner sc = new Scanner(System.in); //scanner litta

        long t = sc.nextLong(); //input litta

        while (t-- > 0) { //zero kitta
            long n = sc.nextLong();//input litta
            long x = sc.nextLong();//input duji

            long count = 0; //count zero ogi
            for (long a = 1; a <= x; ++a) { //for looplita
                long b_max = Math.min(x - a, n / a); //math lagaya
                for (long b = 1; b <= b_max; ++b) { //duja for lagaya
                    long c_max = Math.min(x - a - b, (n - a * b) / (a + b)); //duja maths lagaya
                    count += Math.max(0, c_max); //count vada
                }
            }

            System.out.println(count); //counnt print kita
        }

    
    }
}
