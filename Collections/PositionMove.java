//WAP to store 10 integers in a Vector and shift all elements to the left by 2 positions.

import java.util.*;

public class PositionMove
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	
	Vector v = new Vector();
	
	for(int i=0;i<10;i++)
	{
		v.add(sc.nextInt());
	}	
	
	Vector temp = new Vector();
	//to move position .
	int shift = 2;
	for(int i=0;i<shift;i++)
	{
		temp.add(v.get(i));
	}
	
	//remove now elements.
	
	for(int i=0;i<shift;i++)
	{
		
		v.remove(0);
	}
	
	//show 
	
	for(int i=0;i<temp.size();i++)
	{
		
		v.add(temp.get(i));
	}
	
	
	System.out.println("Elements after move position :");
	
	for(int i=0;i<v.size();i++)
	{
		
		System.out.println(v.get(i) + " " );
	}
  }
}

1
2
3
34
4
5
6
7
8
9
Elements after move position :
3
34
4
5
6
7
8
9
1
2
