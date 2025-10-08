
//Q10. Problem: Store integers in a Vector. Remove all odd numbers and print only even numbers.

import java.util.*;

public class VECTOR10
{
    public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  
	  Vector v = new Vector();     //Define Vector 
	  
	  System.out.println("Enter Number to Enter  How Much Elements  want: ");
	  int n =  sc.nextInt();               // How much want there take it from user.
	  
	  System.out.println("Enter Integer : ");
	  for(int i=0 ;i<n;i++)           //For loop for take loop from usr and add it in vector as  required..
	  {
	     v.add(sc.nextInt());           //add numbe linewise.
	  }
	  
	  
	  Vector even  = new Vector();            // Another vector to check number is even or not .
	  
	  for(int i=0;i<v.size();i++)
	  {
	   
	      int num = (int)v.get(i);
			if(num % 2 == 0)         //check condition .
			{
				even.add(num);              //add elements which are even .
			}
		     	     
	  }
	   System.out.println("Elements After REMOVE OF odd Integer : ");
	   
	   for(int i=0;i<v.size();i++)              // display all elements in  vector which are even .
	   {
		   
		   System.out.println(even.get(i) + " ");
	    }
	   }
	}

/*
 output:
 Enter Number to Enter  How Much Elements  want:
5
Enter Integer :
12
13
24
13
24
Elements After REMOVE OF odd Integer :
12
24
24*/
