//WAP to create Player class and store player id,name,
//run in Vector class and and sort player data using its
// run as well as find the list of player whose run is same 

import java.util.*;

class Player
{
    int id;
	String name;
	int run;

    Player(int id,String name, int run)
	{
	   this.id = id;
	   this.name = name;
	   this.run = run;
	}
	void display()
	{
	   System.out.println("Id " + id + "Name :" + name +  "Run : " + run);
	}
	
}
public class PlayerData
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 
	Vector<Player>	v = new Vector<>();;
	System.out.println("Enter Number of Elements to Store: ");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
	   System.out.println("Enter Id :");
	   int id = sc.nextInt();
	    
		sc.nextLine();
		
	   System.out.println("Enter Name : ");
	   String name = sc.nextLine();
	   
	   System.out.println("Enter Run :");
	   int run = sc.nextInt();
	   
	   v.add(new Player(id,name,run));
	   
	}
	for(int i=0;i<n;i++)
	{
	   for(int j=i+1;j<v.size();j++)
	   {
	      if(v.get(i).run > v.get(j).run)
		  {
		     Player temp = v.get(i);
			 v.set(i,v.get(j));
			 v.set(j,temp);
		  }
	   }
	   
	}
	System.out.println("\n After Sorting: ");
	for(Player p : v)
	{
	   p.display();
	}
	 System.out.println("Same Runs Player");
	 
	 for(int i=0;i<n;i++)
	 {
	    for(int j=i+1;j<n;j++)
		{
		   if(v.get(i).run ==  v.get(j).run)
		   {
		      v.get(i).display();
			  v.get(j).display(); 
		   }
		
		}
	 }
  }
}