package Basic;
import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        int num;
        long factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
