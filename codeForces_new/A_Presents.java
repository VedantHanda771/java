import java.util.*;

public class A_Presents {

    void present(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        long arr[] =new long[(int)n];
        long ans[] = new long[(int) n];

        for (int i =0;i<n;i++){
            arr[i]=sc.nextLong();
            ans[(int)arr[i] -1] = i+1;
        }

        for (int i=0;i<n;i++){
            System.out.print(ans[i] +" ");
        }
    }

    public static void main(String[] args) {
        new A_Presents().present();
    }
}