/*Q6. Create a Java program with a default constructor for Shop Management (productName, price, quantitySold).
 Operations:
Calculate total sales = price × quantitySold.
Apply 5% discount if totalSales > 20,000.
Add 12% GST after discount.
Display final bill. */

import java.util.*;

class Shop {
    String name;
    int price;
    int qSold;

    // Default constructor
    Shop() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Enter the Product Details ----");

        System.out.print("Enter Name of Product: ");
        name = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextInt();

        System.out.print("Enter Quantity Sold: ");
        qSold = sc.nextInt();

        double sales = price * qSold;
        System.out.println("Total Sales: ₹" + sales);

        
        double discount = 0;
        if (sales > 20000) {
            discount = sales * 0.05;
            sales = sales - discount;
            System.out.println("Discount Applied: " + discount);
            System.out.println("Sales After 5% Discount: " + sales);
        } else {
            System.out.println("No Discount Applied.");
        }

        double gst = sales * 0.12;
        double totalBill = sales + gst;

        System.out.println("GST (12%): " + gst);
        System.out.println("Total Bill: " + totalBill);
    }
}

public class ShopProduct {
    public static void main(String[] args) {
        new Shop(); 
    }
}
/*
output:
---- Enter the Product Details ----
Enter Name of Product: TV
Enter Price: 5000
Enter Quantity Sold: 5
Total Sales: ?25000.0
Discount Applied: 1250.0
Sales After 5% Discount: 23750.0
GST (12%): 2850.0
Total Bill: 26600.0  */
