import java.util.Scanner;

class pre {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Try-with-resources
            var a = Integer.parseInt(sc.nextLine());
            var b = Integer.parseInt(sc.nextLine());
            var c = Integer.parseInt(sc.nextLine());
            var s = sc.nextLine();

            System.out.println(a + b + c + " " + s);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
