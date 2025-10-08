/*Q.1. Bank Account Transactions
Create an Account class with: accNo, name, balance.
Task:
Create array of 5 accounts.
Perform deposit and  withdraw operations.
Display accounts with balance < 1000 (low balance warning).
Sort accounts in descending order of balance */
import java.util.*;
class Account {
    private int accNo;
    private String name;
    private int balance;

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amt) {
        balance =  balance + amt;
        System.out.println("Amount Deposited. Current Balance: " + balance);
    }

    public void withdraw(int amt) {
        if (amt <= balance) {
            balance = balance - amt;
            System.out.println("Withdrawn. Current Balance: " + balance);
		System.out.println("------------------------------------------------");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void display() {
        System.out.println("Account No: " + accNo + ", Name: " + name + ", Balance: " + balance);
    }
}

public class bankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[5];

       
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
			
            System.out.println("\nEnter details for Account ");
			
            System.out.print("Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
			
            String name = sc.nextLine();
			
            System.out.print("Balance: ");
			
            int balance = sc.nextInt();

            accounts[i].setAccNo(accNo);
			
            accounts[i].setName(name);
			
            accounts[i].setBalance(balance);
        }

       
        for (int i = 0; i < accounts.length; i++) {
			
            System.out.println("\nTransactions for Account " + accounts[i].getAccNo());
			
            System.out.print("Enter amount to deposit: ");
            int dep = sc.nextInt();
            accounts[i].deposit(dep);

            System.out.print("Enter amount to withdraw: ");
            int wd = sc.nextInt();
            accounts[i].withdraw(wd);
        }

        
        System.out.println("\nAccounts with balance less than 1000:");
		
		
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getBalance() < 1000) {
                accounts[i].display();
            }
        }

       
        for (int i = 0; i < accounts.length; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].getBalance() < accounts[j].getBalance()) {
                   
				   
                    Account temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
		
        System.out.println("\nAccounts sorted by descending balance:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].display();
        }
    }
}