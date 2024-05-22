/*3.	Design a program to calculate the income tax for an individual based on their taxable income and relevant tax brackets. The program should prompt the user to input their taxable income and then compute the corresponding income tax based on the current tax rates and brackets provided by the tax authority.
Up to 2,50,000: No tax
*2,50,001 to ₹5,00,000: 5% tax
₹5,00,001 to ₹10,00,000: 10% tax
*10,00,001 to ₹30,00,000: 20% tax
Above 30,00,000: 30% tax
for senior Citizen (Age above 60 Years)
Up to 3,00,000: No tax
₹3,00,001 to ₹5,00,000: 5% tax
*5,00,001 to 20,00,000: 10% tax
Above 20,00,000: 20% tax
 */
package Basic;
import java.util.Scanner;

public class Second {

    public static double computeTax(double income, int age) {
        double tax = 0.0;
        if (age <= 60) {
            if (income <= 250000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 250000) * 0.05;
            } else if (income <= 1000000) {
                tax = 250000 * 0.05 + (income - 500000) * 0.10;
            } else if (income <= 3000000) {
                tax = 250000 * 0.05 + 500000 * 0.10 + (income - 1000000) * 0.20;
            } else {
                tax = 250000 * 0.05 + 500000 * 0.10 + 2000000 * 0.20 + (income - 3000000) * 0.30;
            }
        } else {
            if (income <= 300000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 300000) * 0.05;
            } else if (income <= 2000000) {
                tax = 200000 * 0.05 + (income - 500000) * 0.10;
            } else {
                tax = 200000 * 0.05 + 1500000 * 0.10 + (income - 2000000) * 0.20;
            }
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income;
        int age;

        System.out.println("Enter income:");
        income = sc.nextDouble();
        System.out.println("Enter age:");
        age = sc.nextInt();

        double tax = computeTax(income, age);
        System.out.println(tax);

        sc.close();
    }
}
