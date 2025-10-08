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
        return totalBill; // default (no discount)
    }
}

class RegularCustomer extends Customer {
    RegularCustomer(String name, double totalBill) {
        super(name, totalBill);
    }

    double applyDiscount() {
        return totalBill - (totalBill * 0.05); // 5% discount
    }
}

class PremiumCustomer extends Customer {
    PremiumCustomer(String name, double totalBill) {
        super(name, totalBill);
    }

    double applyDiscount() {
        return totalBill - (totalBill * 0.15); // 15% discount
    }
}

class NewCustomer extends Customer {
    NewCustomer(String name, double totalBill) {
        super(name, totalBill);
    }

    double applyDiscount() {
        return totalBill; // no discount
    }
}

class BillGenerate {
    void generateBill(Customer[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.println("Name : " + c[i].name +
                    " | Original Bill : " + c[i].totalBill +
                    " | Final Bill : " + c[i].applyDiscount());
        }
    }
}

public class GroceryBill1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Customers: ");
        int n = sc.nextInt();

        Customer[] cus = new Customer[n];

        BillGenerate obj = new BillGenerate();

        for (int i = 0; i < cus.length; i++) {
            System.out.println("\n1. Regular Customer (5% Discount)");
            System.out.println("2. Premium Customer (15% Discount)");
            System.out.println("3. New Customer (No Discount)");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter Customer Name: ");
            String name = sc.next();

            System.out.print("Enter Bill Amount: ");
            double bill = sc.nextDouble();

            switch (choice) {
                case 1:
                    cus[i] = new RegularCustomer(name, bill);
                    break;
                case 2:
                    cus[i] = new PremiumCustomer(name, bill);
                    break;
                case 3:
                    cus[i] = new NewCustomer(name, bill);
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to New Customer.");
                    cus[i] = new NewCustomer(name, bill);
            }
        }

        obj.generateBill(cus);
      
    }
}
