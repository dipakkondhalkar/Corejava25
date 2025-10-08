//WAP to store 5 values in Vector and arrange in ascending without using sort() methods of Collections 

import java.util.*;

public class SortAcending
{
   public static void main(String[]args)
   {
       Scanner sc = new Scanner(System.in);
	   
      Vector v = new Vector();
	  System.out.println("Insert 5 elements in Array" );
	  for(int i=0;i<5;i++)
	     {
	
		    v.add(sc.nextInt());
		 }

    System.out.println("After Sorting ");
	
	for(int i=0;i<v.size();i++)
	    {
		   for(int j=i+1;j<v.size();j++)
		   {
			      
		      if((int)v.get(i)>(int)v.get(j))
			  {
			      int temp = (int)v.get(i);
				  v.set(j,v.get(j));
				  v.set(j,temp);
			  
			  }
		   
		   }
		 
		}
		System.out.println("Array after Sorted : " + v);
   }
}
/*
output:
Insert 5 elements in Array
21
23
34
12
23
After Sorting
Array after Sorted : [21, 23, 34, 34, 34] */