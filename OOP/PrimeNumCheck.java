/*15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/

import java.util.*;
class Swap
{
   int x,y;
    
     void setData(int a,int b)
	 {
		 
		 x = a;
		 y = b;
		 
	 }
	 void showData(){
	   
	   int temp = x;
	       x = y ;
		   y = temp;
		   System.out.println("Number After Swapping");
		   System.out.println( x );
		   System.out.println( y);
	  }   
}

 public class PrimeNumCheck
 {
    public static void main(String[]args)
	{
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Number before Swapping ");
	  System.out.println("Enter two Numbers");
	  int a = sc.nextInt();
	  

	  int b = sc.nextInt();
	  
	  Swap s1 = new Swap();
	  s1.setData(a,b);
	  s1.showData();
	}
 
 }
 
 Number before Swapping
Enter two Numbers
12
13
Number After Swapping
13
12