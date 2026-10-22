package OOPS;

import java.util.Scanner;

class Person {
    String name;
    int age;
}
class Employee extends Person {
    int employeeId;
    double salary;
}
class Manager extends Employee {
    String department;
    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + (int) salary);
        System.out.println("Department: " + department);
    }
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        System.out.print("Enter Name: ");
        m.name = sc.nextLine();
        System.out.print("Enter Age: ");
        m.age = sc.nextInt();
        System.out.print("Enter Employee ID: ");
        m.employeeId = sc.nextInt();
        System.out.print("Enter Salary: ");
        m.salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        m.department = sc.nextLine();
        m.display();
        sc.close();

	}

}
