/*🔸 Question 2: Vehicle Movement – Dynamic Behavior Based on Vehicle Type
Description:
Create a base class Vehicle with a method move(). Create 3 subclasses: Car, Bike, and Bus. 
Each subclass should override the move() method with its own behavior.
Task:
Write a function startJourney(Vehicle v) that accepts any vehicle object and calls its move() method.
Objective:
Show dynamic method dispatch where the decision of which move() method to call happens at runtime.
*/

import java.util.*;

class Vehicle
{
   
   void move()
     {
	    System.out.println("Vehicle Moving \n");
	 }   
}
class Car extends  Vehicle
{

   void move()
   {
      System.out.println("Car is Moving \n ");
   
   }

}
class Bike extends Vehicle
{
   void move()
   {
   
     System.out.println("Bike is moving with it Wheel....\n");
   }
}
class Bus extends Vehicle
{

   void move()
   {
      System.out.println("Bus is moving with it passenger....\n");
   }

}
class Journey
{
  void startJourney(Vehicle v)
  {
     v.move();
  }

}

public class VehicleApp
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 Journey  s1 = new Journey();
	
	boolean running = false;
	 
	while(true) 
	{
	 System.out.println("-----Vehicle Details------");
	 System.out.println("1. Car ");
	 System.out.println("2. Bike ");
	 System.out.println("3. Bus ");
	 System.out.println("Exit...");
	  
	 System.out.println("Enter Choice :");
	 int choice = sc.nextInt();
	  
	 Vehicle v = null;
	 switch(choice)
	 {
		 case 1 :
		 
		 v = new Car();
		 break;
		 
		 case 2 :
		 
		 v = new Bike();
		 break;
		 
		 case 3 :
		 
		  v = new Bus();
		  break;
		  
		  case 4:
		  
		  System.exit(0);
		  break;
		  
		  default:
		  
		  System.out.println("Invaid input :");
		  break; 
	 
	 }
	 
	 if(v !=null)
	 {
		 
		 s1.startJourney(v);
		 
	 }
  }
}
}
output:
-----Vehicle Details------
1. Car
2. Bike
3. Bus
Exit...
Enter Choice :
1
Car is Moving

-----Vehicle Details------
1. Car
2. Bike
3. Bus
Exit...
Enter Choice :
2
Bike is moving with it Wheel....

-----Vehicle Details------
1. Car
2. Bike
3. Bus
Exit...
Enter Choice :
3
Bus is moving with it passenger....

-----Vehicle Details------
1. Car
2. Bike
3. Bus
Exit...
Enter Choice :
4














