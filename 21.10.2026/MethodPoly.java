package OOPS;

public class MethodPoly {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.addition(20, 40);
        c.addition(10, 20, 30);
    }
}
class Calculator {
    void addition(int a, int b) {
        System.out.println("First Addition: " + (a + b));
    }

    void addition(int a, int b, int c) {
        System.out.println("Second Addition: " + (a + b + c));
    }
}