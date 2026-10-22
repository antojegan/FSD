package OOPS;

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance;
    void getDetails(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + (int) balance);
    }
}
class SavingsAccount extends BankAccount {
    void display() {
        System.out.println("\nSavings Account");
        displayDetails();
    }
}
class CurrentAccount extends BankAccount {
    void display() {
        System.out.println("\nCurrent Account");
        displayDetails();
    }
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        System.out.println("Enter Savings Account Details:");
        savings.getDetails(sc);
        CurrentAccount current = new CurrentAccount();
        System.out.println("\nEnter Current Account Details:");
        current.getDetails(sc);
        savings.display();
        current.display();
        sc.close();

	}

}
