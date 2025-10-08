import java.util.Scanner;

// POJO class
class Product {
    private int productId;
    private String productName;
    private double price;

    // Setters
    public void setProductId(int productId) { this.productId = productId; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setPrice(double price) { this.price = price; }

    // Getters
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }

    // Method to calculate discounted price
    public double getDiscountedPrice() {
        if (price > 1000) {
            return price - (price * 15 / 100); // 15% discount
        }
        return price; // no discount if price <= 1000
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // number of products
        Product[] products = new Product[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            System.out.println("\nEnter details for Product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            products[i].setProductId(sc.nextInt());
            sc.nextLine(); // consume newline

            System.out.print("Product Name: ");
            products[i].setProductName(sc.nextLine());

            System.out.print("Price: ");
            products[i].setPrice(sc.nextDouble());
        }

        // Display product name, original price, and discounted price
        System.out.println("\nProduct Details with Discount:");
        for (int i = 0; i < n; i++) {
              if (products[i].getPrice() > 1000) {  // discount condition
                System.out.println(", Discounted Price: ₹" + products[i].getDiscountedPrice() +
                                   " (15% discount applied)");
            } else {
                System.out.println(", No discount applied");
            }
		}

        sc.close();
    }
}
