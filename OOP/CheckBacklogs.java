/*15. Problem:
 Create class BacklogRecord with fields: studentName, totalSubjects, clearedSubjects.
 Method checkBacklogs():
Backlogs = totalSubjects - clearedSubjects
 If backlog > 0 → print "Backlogs: n"
 Else → "No backlogs"
Objective: Subtraction + conditional display logic.*/


import java.util.*;

class Subject
{
    String Sname;
	int totalSubjects;
	int clear;
	
	public String getName()
	{
	   return Sname;
	}
	public void setName(String Sname)
	{
	   this.Sname = Sname;    
	}
	public int gettotalSubjects()
	{
	    return totalSubjects;
	}
	public void settotalSubjects(int  totalSubjects)
	{
	   this.totalSubjects = totalSubjects;
	}
	public int getclear()
	{
	   return clear;
	}
	public void setclear(int clear)
	{
	  this.clear = clear;
	}	

void displayBack()
{
   int back = totalSubjects - clear;
   if(back>0)
   {
       System.out.println( "BACKLOG : " +back);
   }
   else
   {
   
     System.out.println("There is no Backlog");
   }
 }
}
public class CheckBacklogs
{
   public static void main(String[]args)
   {
     Subject obj = new Subject();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("-----------Enter the Student Data-------------");
	 
	 System.out.println("\n        ------STUDENT NAME------" );
	 String name = sc.next();
	 obj.setName(name);
	 
	 System.out.println("-----SUBJECT TOTAL-----");
	 int totalSubjects = sc.nextInt();
	 obj.settotalSubjects(totalSubjects);
	 
	 System.out.println("----CLEAR----- ");
	 int clear = sc.nextInt();
	 obj.setclear(clear);
	 
	obj.displayBack();
   
   }
} 
/*
OUTPUT:
-----------Enter the Student Data-------------

        ------STUDENT NAME------
PRATIK
-----SUBJECT TOTAL-----
15
----CLEAR-----
10
BACKLOG : 5
  */








