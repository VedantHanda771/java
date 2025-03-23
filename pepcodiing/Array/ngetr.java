import java.util.*;
public class ngetr {
    public static int[] right(int[] arr, int n){
        Stack <Integer> st = new Stack<>();
        int[] arr2= new int[n];
        arr2[n-1] = -1;
        for(int i = n-2;i>=0;i--){
            //-a+
            while(st.size()>0 && arr[i]>= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                arr2[i] = -1;
            } else{
                arr2[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return arr2;
        
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = right(arr, n);
        for(int i:res){
            System.out.print(i + " ");
        }
    }
}
