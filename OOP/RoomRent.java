/*9. Create a Room class with roomNumber, tenantName, and monthlyRent. Create 2 room objects. Calculate the total rent to be paid for 6 months for each tenant.
📝 Explanation:
 Use logic: rent * 6 and display total for each tenant. */
 
 
 import java.util.*;
 class Room
 {
    int rno;
	String name;
	int rent;
	
	public void setrno(int rno)
	{
	  this.rno = rno;
	}
	public int getrno()
	{
	  return rno;
	}
	public void setname(String name)
	{
	  this.name = name;
	}
	public String getname()
	{
	  return name;
	}
	public void setrent(int rent)
	{
	  this.rent = rent;
	}
	public int getrent()
	{
	  return rent;
	}
	
void display()
 {
   System.out.println("Room Number :" + rno );
   System.out.println("Tenent Name : " + name );
   System.out.println( "Rent  : " + rent);

   }
 }

public class RoomRent
{
  public static void main(String []args)
  {
   Scanner sc= new Scanner(System.in);
   
    Room s1=  new Room();
	Room s2 = new Room();
	
	System.out.println("Enter the Details of tenent 1 : ");
	  
	System.out.println("Room Number :");
	s1.setrno(sc.nextInt());
	sc.nextLine();
	
	System.out.println("Room Tenent Name : ");
	s1.setname(sc.nextLine());
	System.out.println("Rent of Room :");
	int roomrent = sc.nextInt();
	
    roomrent = roomrent * 6;
	
    s1.setrent(roomrent);
	  
	  
    System.out.println("Enter the Details of tenent 2 : "); 
	System.out.println("Room Number :");
	s2.setrno(sc.nextInt());
	sc.nextLine();
	System.out.println("Room Tenent Name : ");
	s2.setname(sc.nextLine());
	System.out.println("Rent of Room :");
	int roomrent2 = sc.nextInt();
	
	
	roomrent2 = roomrent2 * 6;
	
    s2.setrent(roomrent2);
	  
	  
	  System.out.println("Room Details : " );
	  s1.display();
	  s2.display();
  }
}
/*
output:
Enter the Details of tenent 1 :
Room Number :
102
Room Tenent Name :
Pratik
Rent of Room :
5000
Enter the Details of tenent 2 :
Room Number :
103
Room Tenent Name :
Manish
Rent of Room :
5000
Room Details :
Room Number :102
Tenent Name : Pratik
Rent  : 30000
Room Number :103
Tenent Name : Manish
Rent  : 30000  */











