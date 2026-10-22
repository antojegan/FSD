package OOPS;

public class SuperKeyword {

    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.bike();
        d.oldCycle();
    }
}
class Father {
    int sbi = 25000;
    void bike() {
        System.out.println("Bike from Father");
    }
    void car() {
        System.out.println("Car from Father");
    }
}
class Daughter extends Father {
    int sbi = 500;
    void bike() {
        System.out.println("Bike from Daughter");
        super.bike();
    }
    void oldCycle() {
        System.out.println("Cycle from Daughter");
        System.out.println("Father SBI Balance: " + super.sbi);
    }
}