/*Q. Problem:
Create an online shopping cart using ArrayList for cart items and a HashSet for unique categories.
Perform the following operations:
Add 8 products to the cart (with duplicates).
Display all products.
Remove a product by index.
Extract unique categories from product names (e.g., "Laptop-HP" → category = Laptop) using HashSet.
Display final cart and unique categories.
Explanation:
Combines ArrayList + HashSet.
Tests duplicate handling, index-based removal, and category extraction logic.
Demonstrates real-world use case of collections working together.
*/

import java.util.*;

public class ShoppingCart
{
 public static void main(String[]args)
 {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Number of Items :");
	   int n = sc.nextInt();
       ArrayList<String> al = new ArrayList<String>();
	   System.out.println("Enter Name Of Item :");
       for(int i=0;i<n;i++)
	   {
		   String name = sc.next();
		   al.add(name);
	   }
	   
	   System.out.println("Items in ArrayList : " + al);
	   
	   HashSet<String> hs = new HashSet<String>(al);
	   System.out.println("Items in HashSET" + hs);

       System.out.println("Enter Index to remove : ");
	   int ind = sc.nextInt();
	   if (ind >= 0 && ind < al.size()) {
            String removed = al.remove(ind);
            System.out.println("Removed from cart: " + removed);
        } else {
            System.out.println("Enter Valid Index");
        }
	  hs = new HashSet<>(al);

        System.out.println("Final Cart (ArrayList): " + al);
        System.out.println("Final Unique Items (HashSet): " + hs);

        
        HashSet<String> hs1 = new HashSet<>();
        for (String item : al) {
            String[] parts = item.split("-"); 
            if (parts.length > 0) {
                hs1.add(parts[0]); 
            }
        }

        System.out.println("Unique Categories : " + hs1);	   
 }
}
output:
Enter Number of Items :
3
Enter Name Of Item :
hp
dell
lenovo
Items in ArrayList : [hp, dell, lenovo]
Items in HashSET[hp, lenovo, dell]
Enter Index to remove :
2
Removed from cart: lenovo
Final Cart (ArrayList): [hp, dell]
Final Unique Items (HashSet): [hp, dell]
Unique Categories : [hp, dell]

