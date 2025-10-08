/*🔸Question 4: Grocery Billing System – Apply Discount Based on Customer Type
Description:
Create a class Customer with fields name and totalBill.
 Then create 3 customer types by extending it: RegularCustomer,PremiumCustomer, and NewCustomer.
Each should override a method applyDiscount() which deducts a discount from the bill:
Regular: 5%
Premium: 15%
New: No discount
Task:
Create an array of different customer objects. 
Apply discount and print final bill for each.
Objective:
Use runtime polymorphism with inheritance, without involving interfaces or enums */

import java.util.*;

class Customer {
    String name;
    double totalBill;

    Customer(String name, double totalBill) {
        this.name = name;
        this.totalBill = totalBill;
    }

    double applyDiscount() {
        return totalBill;
    }
 }

class RegularCustomer extends Customer {
    RegularCustomer(String name, double totalBill) {
        super(name, totalBill);
    }

    double applyDiscount() {
        return totalBill - (totalBill * 0.05);
    }
}

class PremiumCustomer extends Customer {
    PremiumCustomer(String name, double totalBill) {
        super(name, totalBill);
    }

    double applyDiscount() {
        return totalBill - (totalBill * 0.15);
    }
}

class NewCustomer extends Customer {
    NewCustomer(String name, double totalBill) {
        super(name, totalBill);
    }

    double applyDiscount() {
        return totalBill;
    }
}

class Billing {
    void finalBill(Customer[] customers) {
        for (Customer c : customers) {
            System.out.println("-----------------------------");
            System.out.println("Name: " + c.name);
            System.out.println("Original Bill: " + c.totalBill);
            System.out.println("Final Amount: " + c.applyDiscount());
        }
    }
}

public class Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer[] customers = new Customer[3];

        System.out.println("Enter Regular Customer Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Bill: ");
        double bill = sc.nextDouble();
        customers[0] = new RegularCustomer(name, bill);

        sc.nextLine(); // consume newline

        System.out.println("Enter Premium Customer Name: ");
        String pname = sc.nextLine();
        System.out.println("Enter Bill: ");
        double pBill = sc.nextDouble();
        customers[1] = new PremiumCustomer(pname, pBill);

        sc.nextLine(); // consume newline

        System.out.println("Enter New Customer Name: ");
        String cname = sc.nextLine();
        System.out.println("Enter Bill: ");
        double cBill = sc.nextDouble();
        customers[2] = new NewCustomer(cname, cBill);

        Billing b1 = new Billing();
        b1.finalBill(customers);

      
    }
}


