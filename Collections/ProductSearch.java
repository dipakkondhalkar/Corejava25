import java.util.*;

// Product class
class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void display() 
	{
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}

public class ProductSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Product> products = new Vector<Product>();

        
        System.out.println("Enter details of 10 products (id name price):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Product Name: ");
            String name = sc.next();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
			
            products.add(new Product(id, name, price));
        }
      
        System.out.print("\nEnter product ID to search: ");
        int searchId = sc.nextInt();
        boolean found = false;

        for (Product p : products) {
            if (p.getId() == searchId) {
                System.out.println("\nProduct Found:");
                p.display();
                found = true;
                break;
            }
        }
		
        if (!found) {
            System.out.println("Product with ID " + searchId + " not found.");
        }
    }
}
