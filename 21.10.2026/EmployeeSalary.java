package OOPS;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryEmployee e;
        e = new PermanentEmployee();
        e.employeeId = 101;
        e.name = "Arun";
        e.basicSalary = 30000;
        e.display();
        e = new ContractEmployee();
        e.employeeId = 102;
        e.name = "Kumar";
        e.basicSalary = 25000;
        e.display();
    }
}
class SalaryEmployee {
    int employeeId;
    String name;
    double basicSalary;
    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Total Salary: " + calculateSalary());
    }
    double calculateSalary() {
        return basicSalary;
    }
}
class PermanentEmployee extends SalaryEmployee {
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
    void display() {
        System.out.println("Permanent Employee");
        super.display();
    }
}
class ContractEmployee extends SalaryEmployee {
    double calculateSalary() {
        return basicSalary + 2000;
    }
    void display() {
        System.out.println("\nContract Employee");
        super.display();
    }
}