import java.util.*;/**
 * A_Soldier_and_Bananas
 */
public class A_Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int cost=0;
        for(int i=1;i<=w;i++){
            cost+= k*i;
        }
        if(cost>n){
            System.out.println(cost-n);
        } else{
            System.out.println(0);
        }

        
    }
    
}