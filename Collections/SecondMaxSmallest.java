//WAP to store 15 integers in a Vector and find the second largest and second smallest values.

import java.util.*;
public class SecondMaxSmallest
{
  public static void main(String[]args)
  {
	  Scanner sc = new Scanner(System.in);
	  
	  Vector v = new Vector();
	  System.out.println("Enter 15 Elements In Vector: ");
	  
	  for(int i=0;i<15;i++)
	  {
		  v.add(sc.nextInt());
		  
	  }
	      Collections.sort(v);
	  
	  System.out.println("Second SMALLEST Number is :" + v.get(1));
	  System.out.println("Second LARGEST Number is :"+ v.get(v.size() - 1));
	  
  }

}
/*
output:
Enter 15 Elements In Vector:
1
2
3
4
5
6
7
8
90
1
22
12
1
2
1
Second SMALLEST Number is :1
Second LARGEST Number is :90*/

