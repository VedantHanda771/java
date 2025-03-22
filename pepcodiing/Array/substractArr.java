import java.util.*;

public class substractArr {
    public static void sub(int[] arr1,int n, int[] arr2, int m){
        int[] sub = new int[m];
        int i = n-1;
        int j = m-1;
        int k = sub.length-1;
        int c = 0;
        while(k>=0){
            int d = 0;
            int a1v= i>=0?arr1[i]:0;
            if(arr2[j]+c>=a1v){
                d = arr2[j] + c - a1v;
                c = 0;
            } else{
                d = arr2[j] +c+10 -a1v;
                c = -1;
            }
            
            sub[k] = d;
            i--; j--; k--;
        }
        int idx = 0;
        while(idx<sub.length){
            if(sub[idx] == 0){
                idx++;
            }else break;
        }
        while(idx<sub.length){
            System.out.print(sub[idx]+" ");
            idx++;
        }
    }    
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] =  sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        sub(arr1, n, arr2, m);
    }
}
