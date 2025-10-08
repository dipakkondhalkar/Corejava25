*2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes */
 
import java.util.*;

class BankAccount {
    int accNo;
    double balance;

    void set(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    double calculateInterest() {
        return balance; // default no interest
    }
}

class Saving extends BankAccount {
    @Override
    double calculateInterest() {
        return balance + (balance * 0.05); // 5% interest
    }
}

class Current extends BankAccount {
    @Override
    double calculateInterest() {
        return balance + (balance * 0.03); // 3% interest
    }
}

public class BankChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Saving Bank Details-----");
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        Saving s1 = new Saving();
        s1.set(accNo, balance);
        double result = s1.calculateInterest();
        System.out.println("Account No: " + accNo + " Total Balance after 5% Interest: " + result);

        System.out.println("\n-----Current Bank Details-----");
        System.out.print("Enter Account Number: ");
        int accNo2 = sc.nextInt();
        System.out.print("Enter Balance: ");
        double balance2 = sc.nextDouble();

        Current c1 = new Current();
        c1.set(accNo2, balance2);
        double result1 = c1.calculateInterest();
        System.out.println("Account No: " + accNo2 + " Total Balance after 3% Interest: " + result1);

        sc.close();
    }
}
