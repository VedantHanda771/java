import java.util.*;


public class fromat {

    // for int 
    public static int int1(int value) {
        // format of vh771
        // code writing 
        return value;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = int1(n);
        // System.out.println(result);
    }

    // for double int 
    public static int int2(int n, int m){
        // format of vh771 
        // code writing
        System.out.println(n);
        return m;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int result = int2(in1, in2);
        // System.out.println(result);
    }

    // for single string 
    public static String str1(String s){
        // format of vh771
        // code writing
        return s;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = str1(s);
        // System.out.println(result);
    }

    // for two strings 
    public static String str2(String s1, String s2){
        // format of vh771
        // code writing
        System.out.println(s1);
        return s2;
    }
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String result = str2(s1 , s2);
        // System.out.println(result);
    }
    
}
