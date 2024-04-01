import java.util.*;

public class str2 {


    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of Strings:");
        int n=sc.nextInt();
        int tLength=0;
        String arr[]=new String[n];
        sc.nextLine();
        for (int i=0;i<n;i++){
            arr[i]=sc.nextLine();
            tLength+=arr[i].length();
        }

        System.out.println(tLength);


    }
    
}
