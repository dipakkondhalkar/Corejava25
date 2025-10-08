/*WAP to store 15 integer values in a Vector and
 separate even and odd numbers into two different Vectors.*/
 
 import java.util.*;
 
 class NumCheck
 {
   public static void main(String[]args)
   {
      Vector v = new Vector();
	  
	  v.add(98);
	  v.add(12);
	  v.add(23);
	  v.add(3);
	  v.add(34);
	  v.add(54);
	  v.add(34);
	  v.add(78);
	  v.add(24);
	  v.add(19);
	  v.add(89);
	  Vector<Integer> even = new Vector<Integer>();
	  Vector<Integer>  odd = new Vector<Integer>();
	  
	  for(int i=0;i<v.size();i++)
	  {
	     int num = (int)v.get(i);
	     if(num%2==0)
		 {
		    even.add(num);   	 
		 }	 
		 else
		 {
			 odd.add(num);
		 }
	  
	  }
	  System.out.println("Number is Even  :" + even);
	  System.out.println("Number id ODD : "+ odd);
   }
 
 }
