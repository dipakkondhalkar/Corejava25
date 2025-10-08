/*Q8. Create a class HotelBooking with overloaded constructors:
Constructor 1: Accepts bookingId, customerName, nights, roomRate.
Constructor 2: Accepts bookingId, customerName, nights, roomRate, extraServicesCharge.
 Inside the constructors:
Calculate total = nights × roomRate.
Add extraServicesCharge if provided, otherwise add default service charge = ₹500.
If nights ≥ 7, apply 15% discount.
 Display total bill inside constructor. */

import java.util.*;

class Hotel
{
   int id;
   String name;
   int night;
   int rate;
   int totalBill;
   int extraServicesCharge;
   
   Hotel(int id, String name , int night , int rate)
   {
      this.id = id;
	  this.name = name;
	  this.night = night;
	  this.rate = rate;
	 
	   this.extraServicesCharge = 500;//default
	   
	   calculateBill();
	   display();
	   
   }
   
   Hotel(int id , String name , int night, int rate,  int extraServicesCharge)
   {
      this.id = id ;
	  this.name = name;
	  this.night = night;
	  this.rate = rate;
	  this.extraServicesCharge= extraServicesCharge;
	  
	  calculateBill();
	  display();
   }
   
   void calculateBill()
   {
      totalBill = (night * rate) + extraServicesCharge;
	  
	  if(night >= 7)
	  {
	     totalBill = totalBill - totalBill * 15/100;
	  }
   
   }
   void display()
   {
      System.out.println("Booking ID :" +id );
	   System.out.println("Customer Name :" +name);
	   System.out.println("Night  :" +night );
	   System.out.println("Room Rate:" + rate );
	   System.out.println("Extra Charge :" +extraServicesCharge );
	   System.out.println("Total Bill :" + totalBill );
	   System.out.println("---------------------------" );
	  
   }
   
}
public class HotelBooking{

public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        // Example: without extra service charge.
		System.out.println("Enter Hotel Details");
        System.out.println("ID");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
		
		System.out.println("Enter Name:");
        String name = sc.nextLine();
		System.out.println("Enter Nights: ");
        int nights = sc.nextInt();
		System.out.println("Enter Rate :");
        int rate = sc.nextInt();

        Hotel h1 = new Hotel(id, name, nights, rate);

        // Example: with extra service charge
       System.out.println("Enter Hotel Details");
        System.out.println("ID");
        int id1 = sc.nextInt();
        sc.nextLine(); // consume newline
		
		System.out.println("Enter Name:");
        String name1 = sc.nextLine();
		System.out.println("Enter Nights: ");
        int nights1 = sc.nextInt();
		System.out.println("Enter Rate :");
        int rate1 = sc.nextInt();
		System.out.println("Extra Servies :");
        int extra1 = sc.nextInt();

        Hotel h2 = new Hotel(id1, name1, nights1, rate1, extra1);
    }
}



















