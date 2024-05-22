package Basic;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, result = 0;
        char op;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, %): ");
        op = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
