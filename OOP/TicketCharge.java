/*2. Question:
 Create a base class Ticket with ticketNo, name, baseFare.
 Child classes:
BusTicket → add 10% tax.
TrainTicket → add ₹50 reservation charge.
 Input details of tickets and display the final payable amount.
Explanation:
 Shows overriding calculation method and multiple objects processed via parent reference.*/
 
import java.util.*;

class Ticket
{
   int ticketNo;
   String name;
   double baseFare;
   
   void setValue(int ticketNo,String name, double baseFare)
   {
      this.ticketNo = ticketNo;
	  this.name = name;
	  this.baseFare = baseFare;
   }
   void calculate()
   {
        //default constructor......
   }
}
class BusTicket extends Ticket
{
    BusTicket(int ticketNo,String name,double baseFare)
	{
		
		setValue(ticketNo,name, baseFare);
	}
	void calculate()
	{
		baseFare = baseFare + (baseFare * 0.10);
		System.out.println("Ticket After 10% Tax : " + baseFare);
	}
	
	
} 
class TrainTicket  extends Ticket
{
	TrainTicket(int ticketNo,String name,double baseFare)
	{
		
		setValue(ticketNo,name, baseFare);
	}
	void calculate()
	{
		baseFare = baseFare + 50;
		System.out.println("Ticket After 50 rupees Reservation Charge : " + baseFare);
	}
	
}
public class TicketCharge
{
	public static void main(String[]args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 Ticket[] tickets = new Ticket[2];
		 
		 for(int i=0;i<tickets.length;i++)
		 {
		 System.out.println("--------Bus Ticket-----------");
		 System.out.println("Ticket Id : ");
		 int id = sc.nextInt();
		 System.out.println("Name : ");
		 String name1 = sc.next();
		 System.out.println("Price : ");
		 double baseFare1 = sc.nextDouble();
		 
		 
		 
		 // System.out.println("----------Train Ticket-----------");
		 // System.out.println("Ticket Id : ");
		 // int id1 = sc.nextInt();
		 // System.out.println("Name : ");
		 // String name2 = sc.next();
		 // System.out.println("Price : ");
		 // double baseFare2 = sc.nextDouble();
		 tickets[i] = new BusTicket(id,name1,baseFare1);
		 tickets[i] = new TrainTicket(id,name1,baseFare1);

   
		 }
		 
         System.out.println("-------------Ticket Details---------------");
          
		  for(int i=0;i<tickets.length;i++)
		  {
			  tickets[i].calculate();
		  }			 	
	}

}