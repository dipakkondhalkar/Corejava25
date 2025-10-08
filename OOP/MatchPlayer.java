/*Q5. Write a Java program with a default constructor to handle Cricket Player Statistics (name, matches, runs in each match).
 Operations:
Calculate total runs.
Find the highest score in a match.
Display batting average (totalRuns/matches).
Show "Star Player" if average ≥ 50.
*/

import java.util.*;

class CriketPlayer
{
    String name;
	int match;
	int run[];
	int totalRuns;
	int highestScore;
	double avg;
	
	CriketPlayer()
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("----Enter Details of Player-----");
	   
	   System.out.println("Enter Name: ");
	   name = sc.nextLine();
	   
	   System.out.println("Enter Matches Played");
	   match = sc.nextInt();
	   
	   run =  new int[match];
	   totalRuns  = 0;
	   highestScore = 0;
	   
	   for(int i=0 ;i<match ;i++)
	   {
	     
	   System.out.println("Enter Runs of match " );
	   run[i] = sc.nextInt();
	   
	   totalRuns = totalRuns + run[i];
	   
	   if(run[i] > highestScore)
	   {
	       highestScore = run[i];
	   
	   }
	   }
	     avg =(double)totalRuns /match;
	    
	   System.out.println("----Played Statistics----");
	   System.out.println("Name"+ name);
	   System.out.println("Matches : " + match);
	   System.out.println("Total run : " + totalRuns);
	   System.out.println("High Score in Match : "+ highestScore);
	   System.out.println("Average is : "+ avg);
	   
	   if(avg > 50)
	   {
		   System.out.println("Star Player" );  
	   }   
	}
	
	
}

public class MatchPlayer
{
  public static void main(String []args)
  {
     new CriketPlayer();
  
  }
}

/*output:
Enter Name:
virat
Enter Matches Played
5yh
Enter Runs of match
26
Enter Runs of match
74
Enter Runs of match
241
Enter Runs of match
354
Enter Runs of match
435
----Played Statistics----
Namevirat
Matches : 5
Total run : 1130
High Score in Match : 435
Average is : 226.0
Star Player  */













