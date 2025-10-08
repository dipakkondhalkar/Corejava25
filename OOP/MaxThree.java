// 6. Find the Maximum of Three Numbers
//Create a class MaxFinder with a method findMax that returns the largest of three numbers.
//Explanation: Enhances problem-solving using conditional statements.   give solution as required

import java.util.*;
class Max
{
   int a;
   int b;
   int c;
   
  void getData(int x,int y,int z)
   {
     a=x;
     b=y;
     c=z;	 
   
   }
   void showData()
   {
      if(a>b && a>c)
	  {
	  System.out.println("First Number is Greater");  
	  }
	  else if(b>a && b>c)
	  {
	    System.out.println("Second Number is Greater");
	  
	  }
	  else
	  {
	    System.out.println("Third Number is Greater");
	  }
   }
}

class MaxThree
{
   public static void main(String[]args)
   {
     Scanner sc =  new Scanner(System.in);
	 
	 System.out.println("Enter First Number");
	 int x = sc.nextInt();
	 
	 System.out.println("Enter Second Number");
	 int y = sc.nextInt();
	 
	 System.out.println("Enter Third Number");
	 int z = sc.nextInt();
	 
	 Max s1 = new Max();
	 s1.getData(x,y,z);
	 s1.showData();	 
     
	 }
}

// output:
// Enter First Number
// 10
// Enter Second Number
// 20
// Enter Third Number
// 30
// Third Number is Greater






