import java.util.*;

public class StringCompresion {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        int res = isCompressed(str);
        System.out.println(res);
    }

    public static int isCompressed(char[] str){
        int rv = 1;
        int len = str.length;
        StringBuilder sb = new StringBuilder();
        if(len == 0){
            return 0;
        }
        for(int i = 1;i<len;i++){
            if(str[i] == str[i-1]){
                rv++;
            } else{
                sb.append(str[i-1]).append(rv);
                rv = 1;
            }
        }
        sb.append(str[len-1]).append(rv);
        return sb.length();
    }
}
