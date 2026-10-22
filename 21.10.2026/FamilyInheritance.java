package OOPS;

public class FamilyInheritance {
    public static void main(String[] args) {
        YoungerSon s1 = new YoungerSon();
        s1.oldCycle();
        s1.bike();
        System.out.println("SBI Balance: " + s1.sbi);
        System.out.println("HDFC Balance: " + s1.hdfc);
        System.out.println();
        ElderSon s2 = new ElderSon();
        s2.newCycle();
        s2.bike();
        s2.Car();
        System.out.println("SBI Balance: " + s2.sbi);
        System.out.println("HDFC Balance: " + s2.hdfc);
    }
}
class Father {
    int sbi = 25000;
    void bike() {
        System.out.println("Bike from Father");
    }
    void Car() {
        System.out.println("Car from Father");
    }
}
class YoungerSon extends Father {
    int hdfc = 500;
    void oldCycle() {
        System.out.println("Old Cycle from Younger Son");
    }
}
class ElderSon extends Father {
    int hdfc = 1500;
    void newCycle() {
        System.out.println("New Cycle from Elder Son");
    }
}