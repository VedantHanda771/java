import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Choose operation: 1 : + (Addition) a + b\r\n" + //
                        "2 : - (Subtraction) a - b\r\n" + //
                        "3 : * (Multiplication) a * b\r\n" + //
                        "4 : / (Division) a / b\r\n" + //
                        "5 : % (Modulo or remainder) a % b\r\n" //
                        );
        int c = sc.nextInt();

        switch (c) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;  
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;

        
            default: System.out.println("Invalid Opreation");
                break;
        }

    }
    
}
