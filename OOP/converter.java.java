/*2. Problem:
Create a class Converter with overloaded methods convert to:
Convert kilometers to miles
Convert Celsius to Fahrenheit
Convert a character to its ASCII value
Expected Overloads:
double convert(double km);         // convert km to miles
double convert(int celsius);       // convert Celsius to Fahrenheit
int convert(char ch);              // convert char to ASCII  */

import java.util.*;

class converter
{
   double convert(double km)
   {
     double miles = km*0.621371;
	 return miles;
   
   }
   double convert(int cel)
   {
   double Fah = (cel *  9/5) + 32;
   return Fah;
   
   }
   int convert(char ch)
   {    
	  return (int)ch;
   }
}
public class overlaod2{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   
   converter s1 = new converter();
   
   System.out.println("Enter KM");
   double km = sc.nextInt();
   //double miles = s1.convert(km);
   System.out.println("Kilometer to Miles is "+ s1.convert(km) + "\n");
   
   
   System.out.println("Enter Celcies ");
   int cel = sc.nextInt();
  // double Fah = s1.convert(cel);
   System.out.println("Celcius to Fahrenheit is "  + s1.convert(cel) +"\n");
   
   
   System.out.println("Enter Character ");
    char  ch = sc.next().charAt(0);
	System.out.println("char to Asscii is " + s1.convert(ch));
	
   
   }
   
}