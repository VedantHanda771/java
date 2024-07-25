import java.util.*;

public class A_Anton_and_Danik {

    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        long an=0;
        long da=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'A'){
                an++;
            } else {
                da++;
            }
        }

        if(an>da){
            System.out.println("Anton");
        } else if(an==da){
            System.out.println("Friendship");
        } else{
            System.out.println("Danik");
        }
    }
}