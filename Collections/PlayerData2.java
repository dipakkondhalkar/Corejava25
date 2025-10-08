/*Q4/. Sort Players by Runs
Create a Player class with name and runs.
Store players in an ArrayList.
Sort players in descending order of runs.
 Explanation:
 For descending order, you will return negative in compareTo() logic or reverse the sorting.*/
 
 import java.util.*;
 
class Players implements Comparable
{
  
   private String name;
   private int runs;
   
   public Players()
   {
   
   }
   public Players(String name,int runs)
   {
   
	 this.name =name;
	 this.runs = runs;
   }
  
   public void setname(String name)
   {
      this.name =name;
   }
   public String getname()
   {
      return name;
   }
   public void setruns(int runs)
   {
      this.runs = runs;
   }
   public int getruns()
    {
	   return runs;
	}   
  
    public int compareTo(Object o)
	{
	   Players p = (Players)o;
	   if(this.runs < p.runs)
	     {
		   return 1;
		 }
		else if(this.runs > p.runs)
          {
		     return -1;
		  }		
		  else
		  {
		     return 0;
		  }
	}
}
public class PlayerData2
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  List list = new ArrayList();
	  
	   list.add(new Players("Deep ",91));
	  list.add(new Players("Vijay",89));
	  list.add(new Players("ram",94));
	  list.add(new Players("ramesh",99));
	  list.add(new Players("pranav",71));
	   
	   System.out.println("==========PRODUCT PRICE BEFORE SORTING ===========");
	   for(Object obj:list)
	   {
	      Players p = (Players)obj;
		  System.out.println( "\t" + p.getname() + "\t" + p.getruns());
	   }
  Collections.sort(list);
	   System.out.println("==========PRODUCT PRICE AFTER SORTING ===========");
	   for(Object obj:list)
	   {
	      Players p = (Players)obj;
		  System.out.println("\t" + p.getname() + "\t" + p.getruns());
	   }
	   Collections.reverse(list);
	   
      System.out.println("==========PRODUCT PRICE AFTER REVERSE ===========");
	   for(Object obj:list)
	   {
	      Players p = (Players)obj;
		  System.out.println("\t" + p.getname() + "\t" + p.getruns());
	   }
   }
}
output:

==========PRODUCT PRICE BEFORE SORTING ===========
        Deep    91
        Vijay   89
        ram     94
        ramesh  99
        pranav  71
==========PRODUCT PRICE AFTER SORTING ===========
        ramesh  99
        ram     94
        Deep    91
        Vijay   89
        pranav  71
==========PRODUCT PRICE AFTER REVERSE ===========
        pranav  71
        Vijay   89
        Deep    91
        ram     94
        ramesh  99  

