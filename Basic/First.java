/*1.	Write a program to take Basic salary of employee from user and calculate gross salary with given 
 * condition, if Basic salary >= 10000 then we calculate 40% da and 30% ta of Basic salary otherwise 30% da 
 * and 20% ta of Basic salary.
 */
package Basic;
import java.util.*;
public class First {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double basicSalary, da, ta, grossSalary;
		System.out.println("Enter Basic Salary:");
		basicSalary = sc.nextDouble();
		if (basicSalary >= 10000 ) {
			da = basicSalary * 0.40;
			ta = basicSalary * 0.30;
		} else {
			da = basicSalary * 0.30;
			ta = basicSalary * 0.20;
		}
		grossSalary = basicSalary + da + ta;
		System.out.println("Gross Salary :"+grossSalary);
	}

}
