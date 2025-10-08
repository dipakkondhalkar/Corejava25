/*Q5. Problem: Create a Seat class with: seatNo, category (Silver/Gold/Platinum), price, isBooked.
In the main program:
Add all seats for a show.
Book seats (change isBooked to true).
Cancel a seat booking.
Display all available seats sorted by price descending (no inbuilt sort).
Calculate total revenue from booked seats.
*/

import java.util.*;
class Booking
{
  private int seatNo;
  private String category;
  private double price;
  private boolean isBooked;
  
  public void setseatNo(int seatNo)
  {
    this.seatNo = seatNo;
  }
  public int getseatNo()
  {
     return seatNo;
	 
  }
  public void setcategary(String category)
  {
     this.category = category;
  }
  public int getcategory()
  {
     return category;
  }
  public void setprice(double  price)
  {
     this.price = price;
  }
  public double()
  {
    return price;
  }
  public void setisBooked(boolean isBooked)
  {
     this.isBooked = isBooked;
  }
  public double getisBooked()
  {
     return isBooked;
  }
  


}
public class SeatBook
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 Booking a[] = new Booking[1];
		int ch;
		do{
			System.out.println("\n===== MENU =====");
			System.out.println("1. Add all seats ");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Display Available Seats (Sorted by Price Desc)");
            System.out.println("5. Calculate Total Revenue");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
			
          do{
		  
		     swicth(ch)
			 {
			    case 1:
				
				
				for(int i=0; i<a.length; i++){
					a[i] = new Booking();
					
					System.out.println("\nEnter details for seat " + (i + 1));
					a[i].setNo(sc.nextInt());
					
					sc.nextLine();
					System.out.println("category (Silver/Gold/Platinum)");
					a[i].setCategory(sc.nextLine());
					
					System.out.println("Price:");
					a[i].setPrice(sc.nextDouble());
					
					//System.out.println("isBooked");
					a[i].setBook(false);
				}
				System.out.println("seat Booked");
				
				break;
			  
			  
			  default :
			  
			  System.out.println("Invalid Input");
			 }
		  
		 }
		 
  }
}




















