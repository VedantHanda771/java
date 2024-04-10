import java.util.*;

public class binNumber {
    static String[] generateBinaryNumber(int n){
        String[] next = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for (int i =0;i<n;i++){
            next[i] = q.poll();
            String n1 = next[i]+"0";
            String n2 = next[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return next;
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] result = generateBinaryNumber(n);
        for (String s : result){
            System.out.print(s + " ");
        }
    }
    
}
