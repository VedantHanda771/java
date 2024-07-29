import java.util.Scanner;

public class A_Maximize_the_Last_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner hai
        
        int t = scanner.nextInt(); //imnput hai eh
        
        while (t-- > 0) { //zero kita t
            int n = scanner.nextInt();//ndhai
            int[] a = new int[n];//array hai 
            
            for (int i = 0; i < n; i++) {//lop hai
                a[i] = scanner.nextInt();//inptu ahfda
            }
            
            int ans = Integer.MIN_VALUE; //ansfher hai
            for (int i = 0; i < n; i++) {//jai shere ram
                if (i % 2 == 0) {
                    ans = Math.max(ans, a[i]);//jai shrer ram
                }
            }
            
            System.out.println(ans);//jai shre ram
        }
        
       //end
    }
}
