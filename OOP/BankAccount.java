/*Q.5
Create a class BankAccount with accountNo, holderName, and balance.
Requirements:
Use createAccount() method to set data.
Methods for deposit(int amt), withdraw(int amt), and showBalance().  */

import java.util.*;

class Bank {
    int no;
    String name;
    int balance;

    void createAccount(int a, String b, int c) {
        no = a;
        name = b;
        balance = c;
    }

    void deposit(int amt) {
        balance = balance + amt;
        System.out.println("Amount Deposited  : " + amt);
    }

    void withdraw(int amt) {
        if (amt > balance) {
            System.out.println("Insufficient Balance! Withdrawal failed");
        } else {
            balance = balance - amt;
            System.out.println("Amount Withdrawn : " + amt);
        }
    }

    void showBalance() {
        System.out.println("\nAccount number : " + no);
        System.out.println("Holder Name    : " + name);
        System.out.println("Balance Amount : " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Bank object
        Bank s1 = new Bank();

        System.out.print("Enter Account number: ");
        int no = sc.nextInt();

        System.out.print("Enter Holder Name: ");
        String name = sc.next();

        System.out.print("Enter Balance: ");
        int balance = sc.nextInt();

        // Create account
        s1.createAccount(no, name, balance);

        System.out.print("Enter the amount to deposit: ");
        int depositAmt = sc.nextInt(); // define deposit amount
        s1.deposit(depositAmt);

        System.out.print("Enter the amount to withdraw: ");
        int withdrawAmt = sc.nextInt(); // define withdrawal amount
        s1.withdraw(withdrawAmt);

        s1.showBalance();
    }
}
/*
output:

Enter Account number: 123456
Enter Holder Name: Dipak
Enter Balance: 5000
Enter the amount to deposit: 1000
Amount Deposited  : 1000
Enter the amount to withdraw: 2000
Amount Withdrawn : 2000

Account number : 123456
Holder Name    : Dipak
Balance Amount : 4000   */