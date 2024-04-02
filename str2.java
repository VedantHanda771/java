import java.util.*;

public class str2 {


    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter number of Strings:");
        // int n=sc.nextInt();
        // int tLength=0;
        // String arr[]=new String[n];
        // sc.nextLine();
        // for (int i=0;i<n;i++){
        //     arr[i]=sc.nextLine();
        //     tLength+=arr[i].length();
        // }

        // System.out.println(tLength);

        // String org=sc.next();
        // String result="";

        // for (int i=0;i<org.length();i++){
        //     if(org.charAt(i)== 'e'){
        //         result+='i';

        //     } else{
        //         result+=org.charAt(i);
        //     }

            
        // }

        // System.out.println(result);

        String gmail=sc.next();
        String userName = "";
        for (int i=0;i<gmail.length();i++){
            if(gmail.charAt(i)=='@'){
                break;

            } else {
                userName+=gmail.charAt(i);
            }

        }
        System.out.println(userName);


    }
    
}
