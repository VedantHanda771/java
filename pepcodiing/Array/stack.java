import java.util.*;
public class stack {
    public static boolean valid(String s){
        Stack <Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ')'){
                if(st.peek() == '('){
                    return true;
                }else{
                while(st.peek() != '('){
                    st.pop();
                }
            }
            } else{
                st.push(c);
            }
        }
        return false;
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        boolean res = valid(s);
        System.out.println(res);
    }
}
