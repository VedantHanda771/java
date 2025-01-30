import java.util.*;

public class A_Halloumi_Boxes {

    public static void main(String agrs[]){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            int size = scanner.nextInt();
            int k = scanner.nextInt();
            long[] numbers = new long[size];
            
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextLong();
            }
            
            String answer = sortPossibal(size,k, numbers);
            System.out.println(answer);
        }
        scanner.close();
    }


    public static String sortPossibal(int n, int k, long[] arr){
        if(k <2 && !Arrays.equals(arr, Arrays.stream(arr).sorted().toArray())){
            return "NO";
        }
        // if(arr = Arrays.sort(arr) != null){
        //     return "YES";
        // }
        return "YES";
    }
}