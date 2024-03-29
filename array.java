import java.util.*;

public class array {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number of marks you want to enter: ");
        int n=sc.nextInt();
        
        int [] marks=new int[n];
        for (int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("enter the index of the number want: ");
        int x=sc.nextInt();

        // System.out.println("Here are the malrks you entered:");
        
        
        // linear search
        for (int i=0;i<marks.length;i++){
            if(marks[i]==x){
                System.out.println("Index is: "+ i);
            }
        }


        
    }


    
}
