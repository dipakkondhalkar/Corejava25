//WAP to store 10 values in Vector and find duplicated values

import java.util.*;
public class Duplicate
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  Vector v = new Vector();
	  
     System.out.println("Enter 10 Numbers :");
	 
	 for(int i=0;i<10;i++)
	 {
	     v.add(sc.nextInt());
	 }
	 
	 
	 System.out.println("Duplicate Elements are :");
	 Vector d = new Vector();
	 
	 for(int i=0;i<v.size();i++)
	 {
	    for(int j= i + 1;j<v.size();j++)
		{
		    if(v.get(i).equals(v.get(j)))
			{
			  System.out.println(v.get(i));
			  
			  d.add(v.get(i));
			}
		}
	 }
   }
}
/*
output:
Enter 10 Numbers :
12
12
23
34
45
2
1
2
1
2
Duplicate Elements are :
12
2
2
1
2 */