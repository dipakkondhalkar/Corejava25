/*Q4. Create a Java program with a default constructor for a BankAccount (accNo, name, balance).
 Operations
Deposit a given amount
Withdraw a given amount (check balance before withdrawal).
Apply interest = 3% of current balance.
Display final account details.*/

import java.util.*;

class BankAccount {
    int accNo;
    String name;
    double balance;

    // default (no-argument) constructor: just set defaults
    BankAccount() {
        accNo = 0;
        name = "Unknown";
        balance = 0.0;
    }

    void setDetails(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    void applyInterest() {
        double interest = balance * 0.03;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void display() {
        System.out.println("\n----Final Account Details----");
        System.out.println("Account No : " + accNo);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : " + balance);
    }
}

public class BankBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create account object with default constructor
        BankAccount acc = new BankAccount();

        // ask details separately
        System.out.print("Enter Account Number: ");
        int no = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String nm = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        acc.setDetails(no, nm, bal);

        // perform operations
        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double wit = sc.nextDouble();
        acc.withdraw(wit);

        acc.applyInterest();
        acc.display();

        sc.close();
    }
}
