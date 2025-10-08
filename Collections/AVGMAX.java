/*7. WAP to store 10 floating-point values in a Vector and calculate the average, 
maximum, and minimum. */

import java.util.*;

class AVGMAX
{
   public static void main(String[]args)
   {
      Vector<Double> v = new Vector<>();
	  v.add(12.3);
	  v.add(13.3);
	  v.add(11.2);
	  v.add(10.1);
	  v.add(9.01);
	  v.add(23.21);
	  
	  double sum = 0;
	  double max = v.get(0);
	  double min = v.get(0);
	  
	  for(int i=0;i<v.size();i++)
	  {
		double num =  v.get(i); 
		sum = sum + num;
	     if(num > max)max = num;
		 if(num<min)min = num;
	  }
     double average = sum/v.size();
	 
	 System.out.println("Average is : "+  average);
	 System.out.println("Minimum is : " + min);
	 System.out.println("Maximum is : " + max);
   
   }

}