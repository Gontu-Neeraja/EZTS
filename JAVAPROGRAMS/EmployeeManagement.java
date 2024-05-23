package JAVAPROGRAMS;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    void setHourlyRate(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double getSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee ftEmployee1 = new FullTimeEmployee();
        ftEmployee1.setDetails("Manoj", 30);
        ftEmployee1.setSalary(5000);
        employees.add(ftEmployee1);

        PartTimeEmployee ptEmployee1 = new PartTimeEmployee();
        ptEmployee1.setDetails("Revathi", 20);
        ptEmployee1.setHourlyRate(15, 80);
        employees.add(ptEmployee1);

        FullTimeEmployee ftEmployee2 = new FullTimeEmployee();
        ftEmployee2.setDetails("Ananya", 40);
        ftEmployee2.setSalary(6000);
        employees.add(ftEmployee2);

        PartTimeEmployee ptEmployee2 = new PartTimeEmployee();
        ptEmployee2.setDetails("Charan", 25);
        ptEmployee2.setHourlyRate(20, 50);
        employees.add(ptEmployee2);

        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
            if (employee instanceof FullTimeEmployee) {
                System.out.println("Monthly Salary: " + ((FullTimeEmployee) employee).getSalary());
            } else if (employee instanceof PartTimeEmployee) {
                System.out.println("Salary based on hours worked: " + ((PartTimeEmployee) employee).getSalary());
            }
            System.out.println();
        }
    }
}


