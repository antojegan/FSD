package OOPS;

public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("Anto Jegan V", 25, 105, 45000, "Computer Science");
        m.display();
    }
}
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int employeeId;
    int salary;
    Employee(String name, int age, int employeeId, int salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, int age, int employeeId, int salary, String department) {
        super(name, age, employeeId, salary);
        this.department = department;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}