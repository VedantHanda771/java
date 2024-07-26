import java.util.*;

public class A_Legs {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in); //scanner define kitta
        int t = sc.nextInt(); //t input litta
        while(t!=0){ //while laga dita
            int n = sc.nextInt(); // n input lita
            if(n%4 ==0){ //if loop ltat
                System.out.println(n/4); //prove kita
            } else //else
            System.out.println((n/4)+1); //duja prove kitta



            t--; //t ghata ta
        }
    }
}