/*7. WAP to store 10 floating-point values in a Vector and calculate the average, 
maximum, and minimum. */


import java.util.*;
class AvgMaxMin 
{
	public static void main(String x[])
	{
		Vector<Double> v = new Vector<Double>();
		v.add(1.2);
		v.add(2.34);
		v.add(6.7);
		v.add(4.5);
		v.add(9.6);
		v.add(4.7);
		v.add(6.3);
		v.add(9.2);
		v.add(5.7);
		v.add(2.6);
		
		double sum = 0;
		double max = v.get(0);
		double min = v.get(0);
		
		for(int i=0; i<v.size(); i++)
		{
			double num = v.get(i);
			sum = sum + num;
			
			if(num > max) max = num;
			if(num < min) min = num;
		}
		double avarage = sum / v.size();
		System.out.println("Average of Vector is: " + avarage);
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
	}
}