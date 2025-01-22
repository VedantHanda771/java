import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : s2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0){
                map.remove(c);
            }
        }

        return map.size() == 0;
    }
}
