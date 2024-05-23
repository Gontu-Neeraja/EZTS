package JAVAPROGRAMS;

import java.util.Scanner;

class Area {
    double length;
    double breadth;

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        rectangle.setDim(length, breadth);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}

