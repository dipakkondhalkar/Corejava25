/*Q3. Product Sorting by Price
Create a Product class with fields: productId, productName, price.
Store 5 products in an ArrayList.
Sort by price (lowest to highest).
Display sorted list.
 Explanation:
 Tests sorting real-world entities and demonstrates Comparable with numerical fields.*/
 
 import java.util.*;
 
class Product implements Comparable
{
   private int id;
   private String name;
   private int price;
   
   public Product()
   {
   
   }
   public Product(int id, String name,int price)
   {
     this.id = id;
	 this.name =name;
	 this.price = price;
   }
   public void setid(int id)
   {
   this.id = id;
   }
   public int getid()
   {
      return id;
   }
   public void setname(String name)
   {
      this.name =name;
   }
   public String getname()
   {
      return name;
   }
   public void setprice(int price)
   {
      this.price = price;
   }
   public int getprice()
    {
	   return price;
	}   
  
    public int compareTo(Object o)
	{
	   Product p = (Product)o;
	   if(this.price > p.price)
	     {
		   return 1;
		 }
		else if(this.price < p.price)
          {
		     return -1;
		  }		
		  else
		  {
		     return 0;
		  }
	}
}
public class ProductData
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  List list = new ArrayList();
	  
	   list.add(new Product(1,"Brush",3000));
	   list.add(new Product(3,"Pen",2000));
       list.add(new Product(2,"Paste",1000));
       list.add(new Product(4,"pencil",5000));
       list.add(new Product(5,"shirt",6000));
	   
	   System.out.println("==========PRODUCT PRICE BEFORE SORTING ===========");
	   for(Object obj:list)
	   {
	      Product p = (Product)obj;
		  System.out.println("\t" + p.getid() + "\t" + p.getname() + "\t" + p.getprice());
	   }
	   Collections.sort(list);
	   
      System.out.println("==========PRODUCT PRICE AFTER SORTING ===========");
	   for(Object obj:list)
	   {
	      Product p = (Product)obj;
		  System.out.println("\t" + p.getid() + "\t" + p.getname() + "\t" + p.getprice());
	   }


   }
}

OUTPUT:
==========PRODUCT PRICE BEFORE SORTING ===========
        1       Brush   3000
        3       Pen     2000
        2       Paste   1000
        4       pencil  5000
        5       shirt   6000
==========PRODUCT PRICE AFTER SORTING ===========
        2       Paste   1000
        3       Pen     2000
        1       Brush   3000
        4       pencil  5000
        5       shirt   6000

