//3. Create a Product class with fields productId, productName, and price. Create 3 product objects. If the price > 1000, apply a 10% discount and show updated price.
//📝 Explanation:
 //Use simple logic price * 0.90 if price > 1000. Display product name with updated price.


class Product {
    int id;
    String name;
    int price;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public int getprice() {
        return price;
    }

    public double getDiscountedPrice() 
	    {  // Correct return type and method name
        
		  if (price > 1000) 
		  {
            return 0.90 * price;
          }
		else 
		{
            return price;
        }
    }
}

public class ProductDetail {
    public static void main(String[] args) {
        Product s1 = new Product();
        Product s2 = new Product();
        Product s3 = new Product();

        s1.setid(1);
        s1.setname("Oil");
        s1.setprice(200);

        s2.setid(2);
        s2.setname("Colgate");
        s2.setprice(3000);

        s3.setid(3);
        s3.setname("Biscuit");
        s3.setprice(1100);

        System.out.println("Product that has price greater than 1000 with discount:");

        System.out.println(s1.getname() + " Rs " + s1.getDiscountedPrice());
        System.out.println(s2.getname() + " Rs " + s2.getDiscountedPrice());
        System.out.println(s3.getname() + " Rs " + s3.getDiscountedPrice());
    }
}
/*
output:
Product that has price greater than 1000 with discount:
Oil Rs 200.0
Colgate Rs 2700.0
Biscuit Rs 990.0  */