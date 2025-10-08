/*9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic. */

import java.util.*;
class FAPP
{
   double cel;
   
   void getData(double a)
   {
     cel= a;
   }
   
   double showData()
   {
     double Fah = (cel*9/5) + 32;

	 System.out.println("Celcius to Fahrenheit = " + Fah);
      return Fah;
   
   }
}
class Fahrenheit
{
  public static void main(String[]args)
  {
    Scanner  sc = new Scanner(System.in);
	
	System.out.println("Enter Celcius");
	double a = sc.nextInt();
	
	

	FAPP s1 = new FAPP();
	s1.getData(a);
	s1.showData();	
  }
}
/*
output:
Enter Celcius
12
Celcius to Fahrenheit = 53.6  */
