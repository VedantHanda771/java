import java.util.*;

public class A_Triangle {

    public static int int1(int[] arr) {
        // format of vh771
        // code writing
        Arrays.sort(arr); 
        if(arr[0] + arr[1] >arr[2] || arr[1] + arr[2] >arr[3]){
            System.out.println("TRIANGLE");
        } else if(arr[0]+arr[1]==arr[2] || arr[1] + arr[2]==arr[3]){
            System.out.println("SEGMENT");
        } else{
            System.out.println("IMPOSSIBLE");
        }
        return 0;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        for(int i =0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        int result = int1(arr);
        // System.out.println(result);
    }
}