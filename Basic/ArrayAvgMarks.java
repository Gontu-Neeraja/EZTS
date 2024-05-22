/*Writen a program to take input of marks in  5 subjects from user in an array and then find out the Total
 *  and Average. */
package Basic;
import java.util.Scanner;

public class ArrayAvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i]; 
                    }

        double average = (double) total / 5;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
