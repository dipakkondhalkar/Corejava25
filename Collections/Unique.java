//WAP to store 10 integers in a Vector and check whether all elements are unique.

import java.util.*;
public class Unique
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	
	Vector v = new Vector();
	System.out.println("Enter Elements :");
	
	for(int i=0;i<10;i++)
	{
	   v.add(sc.nextInt());
	}
	
	Collections.sort(v);
   boolean flag = true;
	for(int i=0;i<v.size()-1;i++)
	{
	 
		   int current =(Integer)v.get(i);
		   int next = (Integer)v.get(i+1);
	  if(current == next)
	  {
	   
	      flag = false;
		  break;
	  }
	}
	
     if(flag)
	 {
		 
		 System.out.println("Number is unique  " );
	 }		 
	 else
	 {
		 System.out.println("Not A unique ");
	 }
	}
  }


