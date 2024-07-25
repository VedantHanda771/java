import java.util.*;

public class A_Magnets {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        // int plus=0;
        // int maxi=0;
        int [] groups = new int[n];
        for (int i =0; i <n;i++){
            groups[i] = sc.nextInt();
            

        }
        for (int i= 0;i<n-1;i++){
            if(groups[i]!=groups[i+1]){
                count++;  
            } 
        }
        System.out.println(count);
    }   
}