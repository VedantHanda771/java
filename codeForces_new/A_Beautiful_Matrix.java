import java.util.*;/**
 * A_Beautiful_Matrix
 */
public class A_Beautiful_Matrix {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a=2;
        int b=2;
        int c=0;
        int d=0;
        

        
            int [][] arr=new int[5][5];
            for (int i=0;i<5;i++){
                for (int j=0;j<5;j++){
                    arr[i][j]=sc.nextInt();
                    if(arr[i][j]==1){
                        c=i;
                        d=j;
                    }
                }
            }
            System.out.println(Math.abs(c-a)+Math.abs(d-b));

        
    }
}