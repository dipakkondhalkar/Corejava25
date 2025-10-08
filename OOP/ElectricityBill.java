/*Q6. Create a class ElectricityBill with overloaded constructors:
Constructor 1: Accepts consumerId, consumerName, unitsConsumed.
Constructor 2: Accepts consumerId, consumerName, unitsConsumed, tariffRate.
 Inside the constructors:
If units ≤ 100 → charge per unit = ₹5
If units > 100 and ≤ 300 → charge per unit = ₹7
If units > 300 → charge per unit = ₹10
If tariffRate is provided, override default per-unit charge.
 Calculate total bill and display it in the constructor.
*/
import java.util.*;

class Bill
{
   int ID;
   String name;
   int Unit;
   int rate;
   int totalBill;
   
   Bill(int ID, String name, int Unit)
   {
      this.ID = ID;
	  this.name = name;
	  this.Unit = Unit;
   
       if(Unit <= 100)
	   {
		   rate = 5;
		   
	   }
	   else if(Unit > 100 & Unit <= 300)
	   {
		   rate = 7;
	   }
	   else
	   {
		   rate = 10;
	   }
	   totalBill = rate * Unit;
	   display();
   }
   //Second Contructor.
   
   Bill(int ID , String name, int Unit , int rate)
   {
     this.ID = ID;
	 this.name = name;
	 this.Unit = Unit;
     this.rate = rate;
	 totalBill = rate * Unit;
	 display();
   }
   
   
   void display()
   {
     System.out.println("Id : " + ID);
	 System.out.println("Name :" + name);
	 System.out.println("Unit : " + Unit);
	 System.out.println("Rate Per Unit: " + rate);
	 System.out.println("Total Bill " + totalBill);
	 System.out.println("-------------------------");
	 
   }
}

public class ElectricityBill
{
  public static void main(String []args)
  
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Details OF ElectricityBill");
	 
	 System.out.println("Enter ID: ");
	 int id = sc.nextInt();
	 
	 sc.nextLine();
	 System.out.println("Enter Name : ");
	 String n = sc.nextLine();
    
     System.out.println("Enter Unit");
	 int Un = sc.nextInt();
	 
	Bill b1 = new Bill(id,n,Un);
	
	System.out.println("Enter Rate :");
	int Customrate = sc.nextInt();
	Bill b2 = new Bill(id, n, Un ,Customrate);
   
  }
}
/*
output:
Enter Details OF ElectricityBill
Enter ID:
00001111
Enter Name :
dipak
Enter Unit
200
Id : 1111
Name :dipak
Unit : 200
Rate Per Unit: 7
Total Bill 1400
-------------------------
Enter Rate :
50
Id : 1111
Name :dipak
Unit : 200
Rate Per Unit: 50
Total Bill 10000
-------------------------*/












