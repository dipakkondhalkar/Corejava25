//WAP to create class name as Product with id,name 
//,price and store 10 product detail vector and search product by using its id 


import java.util.*;

class Product
{
   private int id;
   private String name;
   private int price;
   
   Product(int id,String name,int price)
   {
       this.id = id;
	   this.name =name;
	   this.price = price;
   }
   int getid()
   {
	   
	   return id;
   }
   String getname()
   {
	   
	   return name;
   }
   int getprice()
   {
	   
	   return price;
   }
   
   void display()
   {
	   System.out.println("Id :" + id + " Name :" + name + "price :" + price);
   }
}
public class Collection5
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 Vector<Product> v = new Vector<>();
	 
	 
	 for(int i=0;i<3;i++)
	 {
	     System.out.println("Enter ID:");
		 int id =sc.nextInt();
		 System.out.println("Enter Name : " );
		 String name = sc.next();
		 System.out.println("Enter Price :");
		 int price = sc.nextInt();
		 
		 v.add(new Product(id,name,price));
	 }
	 
	 System.out.println("Given Enter Data : ");
	 Iterator<Product> i = v.iterator();
	 while(i.hasNext())
	 {
		Product prod = i.next();
      prod.display(); 

	 }
	 
	 System.out.println("Enter Id to Search :");
	 int search = sc.nextInt();
	 
	 boolean flag = false;
	 
	 for(Product obj: v)
	 {   
           Product prod = (Product)obj;

	     if(prod.getid() == search)
		 {
			prod.display();
		    flag = true;
			break;
		 
		 }
	 }
	 if(!flag)
	 {
		 System.out.println("Not Found : ");
	 }

  }
}
/
OUTPUT:
Enter ID:
2
Enter Name :
dipka
Enter Price :
2000
Enter ID:
12
Enter Name :
deep
Enter Price :
4000
Enter ID:
23
Enter Name :
dinesh
Enter Price :
4000
Given Enter Data :
Id :2name :dipkaprice :2000
Id :12name :deepprice :4000
Id :23name :dineshprice :4000
Enter Id to Search :
23
Id :23name :dineshprice :4000 */