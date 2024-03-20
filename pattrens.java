import java.util.*;

public class pattrens {   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // hollow pattren

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || j==1 || i==n|| j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }

        //right  angel triangele
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted triangle
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // right side triangle
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++) {
                System.out.print(" ");

            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // number pattern
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // numbers on right side
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // inverted number triangle
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
            System.out.print(num);
            num++;
            }
            System.out.println();
        }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        
    }
    
}
