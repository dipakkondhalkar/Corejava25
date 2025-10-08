/*Q9. Create a class CricketPlayer with overloaded constructors:
Constructor 1: Accepts playerId, playerName, runsScored, ballsFaced.
Constructor 2: Accepts playerId, playerName, runsScored, ballsFaced, fours, sixes.
 Inside the constructors:
Calculate strike rate = (runsScored / ballsFaced) × 100
If fours and sixes are given, also calculate boundary runs percentage = ( (fours×4 + sixes×6) / runsScored ) × 100
 Display strike rate and boundary run percentage.
 */

import java.util.*;

class Cricket
{
   int id;
   String name;
   int runs;
   int ballsFaced;
   int fours;
   int sixes;
   double Strike;
   double percentage;
   
   Cricket(int id,String name, int runs, int ballsFaced)
   {
      this.id = id;
	  this.name = name;
	  this.runs = runs;
	  this.ballsFaced = ballsFaced;
	  
	  display();
   }
   
   Cricket(int id,String name, int runs, int ballsFaced, int fours, int sixes)
   {
      this.id = id;
	  this.name = name;
	  this.runs = runs;
	  this.ballsFaced = ballsFaced;
	  this.fours = fours;
	  this.sixes = sixes;
	  
	  Strike =((double)runs / ballsFaced)  * 100;
	  percentage = ((fours *4 + sixes * 6 )/(double)runs) * 100;
	  
	  display();
      
   }
   
   void display()
   {
      System.out.println("ID :" + id);
	  System.out.println("Name : " + name);
	  System.out.println("Runs : "+ runs);
	  System.out.println("Ball Played :" + ballsFaced);
	  System.out.println("Fours : " +  fours);
	  System.out.println("Sixes : " + sixes);
	  System.out.println("Strike Rate : " + Strike);
	  System.out.println(" Run Pecentage : " + percentage);	 
      System.out.println("---------------------------");	  
   
   }
} 

public class CriketPlayer
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Details of CriketPlayer :");
	System.out.println("ID :");
	int i = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Name :");
	String n = sc.nextLine();
	
	System.out.println("Runs Scored :");
	int r = sc.nextInt();
	
	System.out.println("Ball played :");
	int B = sc.nextInt();
	
	Cricket s1 = new Cricket(i,n,r,B);
	
	System.out.println("Fours :");
	int f = sc.nextInt();
	
	System.out.println("Sixes :");
	int s = sc.nextInt();
	
	Cricket s2 = new Cricket(i,n,r,B,f,s);
	
    
  }

}
/*
output:
Enter Details of CriketPlayer :
ID :
1
Name :
dipak
Runs Scored :
1000
Ball played :
100
ID :1
Name : dipak
Runs : 1000
Ball Played :100
Fours : 0
Sixes : 0
Strike Rate : 0.0
 Run Pecentage : 0.0
---------------------------
Fours :
20
Sixes :
25
ID :1
Name : dipak
Runs : 1000
Ball Played :100
Fours : 20
Sixes : 25
Strike Rate : 1000.0
 Run Pecentage : 23.0
---------------------------*/













