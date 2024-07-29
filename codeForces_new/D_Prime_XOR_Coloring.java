import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_Prime_XOR_Coloring { //jai shree ram
    
    public static int findChromaticNumber(int n) { //jai shree ram
        if (n == 1) return 1; //jai shree ram
        if (n == 2) return 2; //jai shree ram
        if (n == 3) return 2; //jai shree ram
        if (n == 4) return 3; //jai shree ram
        if (n == 5) return 3;//jai shree ram
        if (n == 6) return 4;//jai shree ram
        return 4; //jai shree ram
    }

    public static void assignColors(int n, int chromaticNumber, List<Integer> colors) {
        if (n == 1) {//jai shree ram
            colors.add(1);//jai shree ram
            return;//jai shree ram
        }
        if (n == 2) {//jai shree ram
            colors.add(1);//jai shree ram
            colors.add(2);//jai shree ram
            return;//jai shree ram
        }
        if (n == 3) {//jai shree ram
            colors.add(1);//jai shree ram
            colors.add(2);//jai shree ram
            colors.add(2);//jai shree ram
            return;//jai shree ram
        }
        if (n == 4) {//jai shree ram
            colors.add(1);//jai shree ram
            colors.add(2);//jai shree ram
            colors.add(2);//jai shree ram
            colors.add(3);//jai shree ram
            return;
        }
        if (n == 5) {
            colors.add(1);//jai shree ram
            colors.add(2);//jai shree ram
            colors.add(2);//jai shree ram
            colors.add(3);//jai shree ram
            colors.add(3);//jai shree ram
            return;//jai shree ram
        }
        if (n == 6) {
            colors.add(1);
            colors.add(2);//jai shree ram
            colors.add(2);//jai shree ram
            colors.add(3);//jai shree ram
            colors.add(3);//jai shree ram
            colors.add(4);//jai shree ram
            return;
        }

        int currentColor = 1;
        for (int i = 1; i <= n; ++i) {//jai shree ram
            colors.add(currentColor);//jai shree ram
            currentColor = (currentColor % chromaticNumber) + 1;//jai shree ram
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//jai shree ram
        int t = scanner.nextInt();//jai shree ram

        while (t-- > 0) {
            int n = scanner.nextInt();//jai shree ram
            int chromaticNumber = findChromaticNumber(n);
            List<Integer> colors = new ArrayList<>();//jai shree ram

            assignColors(n, chromaticNumber, colors);//jai shree ram

            System.out.println(chromaticNumber);
            for (int i = 0; i < colors.size(); ++i) {
                if (i > 0) System.out.print(" ");//jai shree ram
                System.out.print(colors.get(i));//jai shree ram
            }
            System.out.println();//jai shree ram
        }

        //jai shree ram end
    }
}
