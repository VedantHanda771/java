import java.util.*;

public class arr2d {
    
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the dimensions: " );
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr [][]=new int[r][c];
        System.out.println("enter lements of array: " );

        for (int i =0;i<r;i++){
            for (int j =0;j<c;j++){
                arr[i][j] =sc.nextInt();

            }
        }



        System.out.println("enter element: " );

        int x=sc.nextInt();

        // for (int i=0;i<r;i++){
        //     for (int j=0;j<c;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(arr[i][j]==x){
                    System.out.println("Index is "+ i+","+j);
                }
            }
            
        }

    }
    
}
