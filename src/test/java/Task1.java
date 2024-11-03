import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = num1/num2;

            System.out.println(result);

        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } finally {
            scanner.close();
        }
    }
}
