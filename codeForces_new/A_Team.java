import java.util.*;

public class A_Team{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;
        while(n-- !=0){
            int [] arr=new int[3];
            int cnt=0;
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1){
                    cnt++;
                }
            }
            if(cnt>=2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}