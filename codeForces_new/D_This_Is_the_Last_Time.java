import java.io.*;
import java.util.*;


public class D_This_Is_the_Last_Time {
    static class A {
        long a, b, c;
        A(long a, long b, long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        B r = new B();
        PrintWriter o = new PrintWriter(System.out);

        int t = r.i();
        while (t-- > 0) {
            int n = r.i();
            long k = r.l();

            List<A> x = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long p = r.l(), q = r.l(), s = r.l();
                x.add(new A(p, q, s));
            }

            x.sort(Comparator.comparingLong(z -> z.a));
            long y = k;
            int z = 0;

            PriorityQueue<Long> q = new PriorityQueue<>(Collections.reverseOrder());

            while (true) {
                while (z < n && x.get(z).a <= y) {
                    q.add(x.get(z).c);
                    z++;
                }

                while (!q.isEmpty() && q.peek() <= y) {
                    q.poll();
                }

                if (q.isEmpty()) break;

                y = q.poll();
            }

            o.println(y);
        }

        o.flush();
        o.close();
    }

    static class B {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t;
        String n() {
            while (t == null || !t.hasMoreTokens()) {
                try { t = new StringTokenizer(r.readLine()); }
                catch (IOException e) {}
            }
            return t.nextToken();
        }
        int i() { return Integer.parseInt(n()); }
        long l() { return Long.parseLong(n()); }
    }
}
