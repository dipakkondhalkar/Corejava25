/*Q12. Create a program that stores student names as keys and their marks as values. Perform the following operations:
Insert 5 students with marks.
Update marks of one student.
Remove one student.
Display all students with marks greater than 60.
Explanation:
Demonstrates insert, update, delete, and filtering using Map.
entrySet() helps in iteration for filtering.*/

import java.util.*;
public class StudentData
{
 public static void main(String x[])
 {
   Scanner xyz = new Scanner(System.in);
   
   LinkedHashMap<String,Integer> sm = new LinkedHashMap<>();
   
   System.out.println("Enter the Names and Marks Of Students");
   for(int i=0;i<5;i++)
   {
	String a = xyz.nextLine();
	int k = xyz.nextInt();
	xyz.nextLine();
    sm.put(a,k);
   }
   
   System.out.println("Original Data");
   Set<Map.Entry<String,Integer>> m =sm.entrySet();
   for(Map.Entry<String,Integer> s:m)
   {
	   System.out.println(s.getKey()+"---->"+s.getValue());
   }

   
   System.out.println("Enter the Names of Student and new Marks to update");
   String nm = xyz.nextLine();
   int mm = xyz.nextInt();
   xyz.nextLine();
   sm.put(nm,mm);

   
   System.out.println("Enter the Names of student to remove");
   String rn = xyz.nextLine();
   sm.remove(rn);
    
    
	
	System.out.println("Data After Updating and removing students marks ");
	
   Set<Map.Entry<String,Integer>> md =sm.entrySet();
   for(Map.Entry<String,Integer> s:md)
   {
	   System.out.println(s.getKey()+"---->"+s.getValue());
   }
	
	System.out.println("Marks Greater than 60 are ");
	 Set<Map.Entry<String,Integer>> mf =sm.entrySet();
   for(Map.Entry<String,Integer> s:mf)
   {
	   if(s.getValue()>60)
	   System.out.println(s.getKey()+"---->"+s.getValue());
   }
	
 }
}