import java.util.*;

public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Set<Integer> Integers = new LinkedHashSet<>();
        for(int i=1;i<=4;i++){
            Integers.add(sc.nextInt());
        }
        System.out.println(4-Integers.size());
    }
}