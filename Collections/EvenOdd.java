//WAP to store 15 integer values in a Vector and separate even and odd numbers into two different Vectors.

import java.util.*;
public class EvenOdd
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
	Vector v = new Vector();
	
	System.out.println("Enter Elements In Vector: ");
	
	for(int i=0;i<15;i++)
	{
	   v.add(sc.nextInt());
	
	}
	
	Vector even = new Vector();
	Vector odd = new Vector();

	for(int i=0;i<v.size();i++)
	{  int num = (Integer)v.get(i);
	   if(num% 2 == 0)
	   {
	      even.add(num);
	   }
	   else
	   {
	       odd.add(num);
	   }
   }
   System.out.println("Even Number : " + even);
   System.out.println("Odd Number : "+ odd);
  }
}
/*
output:
Enter Elements In Vector:
12
13
14
15
16
17
18
19
21
23
25
24
26
27
57
Even Number : [12, 14, 16, 18, 24, 26]
Odd Number : [13, 15, 17, 19, 21, 23, 25, 27, 57] */