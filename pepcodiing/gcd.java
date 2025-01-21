import java.util.*;

public class gcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
              int[] nums = new int[n]; 
                for(int i = 0; i < n; i++){
                    nums[i] = sc.nextInt();
                }
                Arrays.sort(nums);
                
                int min = nums[0];
                int max = nums[nums.length-1];
        
                while(min > 0){
                    int result = max % min;
                    if(result == 0){
                        System.out.println(min);
                    }
                    min--;
                }
        
            
    }
    
}
