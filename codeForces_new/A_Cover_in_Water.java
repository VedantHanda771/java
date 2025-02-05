import java.util.*;

public class A_Cover_in_Water {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            long ans = tank(n, s);
            System.out.println(ans);
        }
    }

    public static long tank(int n, String s){
        long e = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i)== '.') e++;
            if(i>0 && i<n-1){
                if(s.charAt(i) == '.' && s.charAt(i-1) == '.' && s.charAt(i+1) == '.'){
                    return 2;
                    
                }
            }
        }
        return e;
    }
}