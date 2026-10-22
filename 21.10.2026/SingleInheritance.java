package OOPS;

public class SingleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.cycle();
        s.bike();
        s.car();
        System.out.println("SBI Balance: " + s.sbi);
        System.out.println("HDFC Balance: " + s.hdfc);
    }
}
class Parent {
    int sbi = 25000;
    void bike() {
        System.out.println("Bike from Father");
    }
    void car() {
        System.out.println("Car from Father");
    }
}
class Student extends Parent {
    int hdfc = 500;
    void cycle() {
        System.out.println("Cycle from Son");
    }
}