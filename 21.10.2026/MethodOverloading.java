package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.display(10);
        c.display(45.5);
        c.display("Anto Jegan V");
    }
}
class ClassA {
    void display(int a) {
        System.out.println("From Class A: " + a);
    }
}
class ClassB extends ClassA {
    void display(double a) {
        System.out.println("From Class B: " + a);
    }
}
class ClassC extends ClassB {
    void display(String str) {
        System.out.println("From Class C: " + str);
    }
}