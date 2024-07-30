import java.util.*;

public class A_Arrival_of_the_General {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int minValue = 103; 
        int maxValue = 0; 
        int minIndex=0;
        int maxIndex=0;

        

        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, arr[i]);
            minValue = Math.min(minValue, arr[i]);
        }

        for(int i=0;i<n;i++) {
            if(arr[i]==maxValue) {
                maxIndex = i;
                break;
            }
        } 

        for(int i=n-1;i>=0;i--) {
            if(arr[i]==minValue) {
                minIndex=i;
                break;
            }
        }

        if(maxIndex < minIndex)
        System.out.println((maxIndex)+(n-1-minIndex));
        else
        System.out.println((maxIndex)+(n-2-minIndex));
        // System.out.println(minIndex);
        // System.out.println(maxIndex);
        
    }
}
