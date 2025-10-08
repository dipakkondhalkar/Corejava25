/*8. WAP to store 15 integer values in a Vector and separate even and odd numbers
into two different Vectors.*/

import java.util.*;
class EvenOddVector
{
	public static void main(String x[])
	{
		Vector v = new Vector();
		v.add(11);
		v.add(15);
		v.add(22);
		v.add(32);
		v.add(38);
		v.add(45);
		v.add(48);
		v.add(52);
		v.add(49);
		v.add(67);
		v.add(76);
		v.add(29);
		v.add(89);
		v.add(92);
		v.add(40);
		
		Vector<Integer> even = new Vector<Integer>();
		Vector<Integer> odd = new Vector<Integer>();
		
		for(int i=0; i<v.size(); i++)
		{
			int num = (int)v.get(i);
			if(num % 2 == 0)
			{
				even.add(num);
			}
			else 
			{
				odd.add(num);
			}
		}
		System.out.println("Even Numbers are : " +even);
		System.out.println("Odd Numbers are : " +odd);
	}
}