import java.util.*;

public class validOpen {
    public static boolean handelClose(Stack<Character> st, char closeB){
        if(st.size() == 0) return false;
        else if(st.peek() != closeB){
            return false;
        } else{
            st.pop();
            return true;
        }
    }
    public static boolean isvalid(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c== '(' || c=='[' || c == '{'){
                st.push(c);
            } else if (c ==')') {
                handelClose(st, '(');
            } else if (c ==']') {
                handelClose(st, '[');
            } else if (c =='}') {
                handelClose(st, '{');
            }
        }
        if(st.size() == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = isvalid(s);
        System.out.println(res);
    }
}
