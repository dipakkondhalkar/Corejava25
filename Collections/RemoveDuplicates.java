//WAP to store 10 values in Vector and remove duplicated values 

import java.util.*;

public class RemoveDuplicates
{
    public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  
	  Vector v = new Vector();
	  
	  System.out.println("Enter 10 Elements  : ");
	  for(int i=0 ;i<10;i++)
	  {
	     v.add(sc.nextInt());
	  }
	  
	 
	  
	  Vector d  = new Vector();
	  
	  for(int i=0;i<v.size();i++)
	  {
	   
		     if(!d.contains(v.get(i)))
			 {
				 d.add(v.get(i));
			 }	     
	  }
	   System.out.println("Elements After Remove Duplicate: ");
	   
	   for(int i=0;i<v.size();i++)
	   {
		   
		   System.out.println(d.get(i) + " ");
	   
     	   }
	   }
	}
 
 /*output:
 Enter 10 Elements  :
12
23
1
2
1
2
3
4
2
23
Elements After Remove Duplicate:
12
23
1
2
3
4*/