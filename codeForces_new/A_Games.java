import java.util.*;

public class A_Games {

    void colors(){
        Scanner sc = new Scanner(System.in);
        // long n=sc.nextLong();
        int n = sc.nextInt();
        sc.nextLine();
        long count = 0;
        int[][] arr=new int[n][2]; 


        for (int i =0;i<n;i++){
            for (int j =0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[i][0]==arr[j][1]) count++;
        }
    }
        System.out.println(count);
        sc.close();
    
    }

    public static void main(String[] args) {
        
        new A_Games().colors();
    }
}