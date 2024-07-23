import java.util.*;/**
 * A_Helpful_Maths
 */
public class A_Helpful_Maths {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char[] s2 =s.toCharArray();
        for(int i=0;i<s.length()-2;i+=2){
            int index = i;
            for(int j=i+2;j<s.length();j+=2){
                if(s2[j]<s2[index]){
                    index=j;
                }
            }
            char temp =s2[i];
            s2[i] =s2[index];
            s2[index] =temp;
            
        }
        System.out.println(s2);
    }
    
}