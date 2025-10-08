/*5. WAP to create class name as Product with id,name,
 price and store 10 product detail 
vector and search product by using its id.*/

import java.util.Scanner;
import java.util.Vector;

class Product {
    private int id;
    private String name;
    private int price;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Product{id=" + id + ", name=" + name + ", price=" + price + "}";
    }
}

public class SearchProduct {
    public static void main(String[] args) {
        Vector v1 = new Vector();

        Product p1 = new Product(); 
		p1.setId(11); 
		p1.setName("Aman"); 
		p1.setPrice(500);
        Product p2 = new Product(); 
		p2.setId(22); 
		p2.setName("Harsh"); 
		p2.setPrice(900);
        Product p3 = new Product(); 
		p3.setId(33); 
		p3.setName("Manoj"); 
		p3.setPrice(200);
        Product p4 = new Product(); 
		p4.setId(44); 
		p4.setName("Sarthak"); 
		p4.setPrice(400);
        Product p5 = new Product();
		p5.setId(55); 
		p5.setName("Pratham"); 
		p5.setPrice(300);
        Product p6 = new Product(); 
		p6.setId(66); 
		p6.setName("Ravi");
		p6.setPrice(750);
        Product p7 = new Product(); 
		p7.setId(77); 
		p7.setName("Sneha"); 
		p7.setPrice(620);
        Product p8 = new Product(); 
		p8.setId(88); 
		p8.setName("Kiran"); 
		p8.setPrice(480);
        Product p9 = new Product(); 
		p9.setId(99); 
		p9.setName("Meena");
		p9.setPrice(510);
        Product p10 = new Product(); 
		p10.setId(100); 
		p10.setName("Tushar"); 
		p10.setPrice(850);

        v1.add(p1); 
		v1.add(p2);
		v1.add(p3); 
		v1.add(p4); 
		v1.add(p5);
        v1.add(p6); 
		v1.add(p7); 
		v1.add(p8); 
		v1.add(p9); 
		v1.add(p10);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < v1.size(); i++) {
            Product p = (Product) v1.get(i);
            if (p.getId() == searchId) {
                System.out.println("Product Found: " + p);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product with ID " + searchId + " not found.");
        }
    }
}