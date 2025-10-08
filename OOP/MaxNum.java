/*
4. Problem:
 Create a class MaximumFinder with overloaded findMax methods to:
Return the maximum of two integers


Return the maximum of three integers
Return the maximum of two floats


Expected Overloads:
int findMax(int a, int b);
int findMax(int a, int b, int c);
float findMax(float a, float b);
*/



import java.util.*;

class MaxNum
{
   

       static int findMax(int a, int b)
	  {   
		  return (a>b) ? a : b;
	  }
	  
	  static int findMax(int a,int b,int c) 
	  {
		 
		  return (a>b && a>c )? a :(b>a && b>c) ? b:c;
      }

	  static float findMax(float a, float b) 
	  {  
		  return (a>b) ? a:b; 
	  }


	
	public static void main(String args[])
	{  Scanner sc=new Scanner (System.in);
		 System.out.print("Enter 2 ELEMENT TO FIND {MAX}: \n");
          int first = sc.nextInt();
		  int second = sc.nextInt();
		 
		 System.out.print("Enter 3 ELEMENT TO FIND {MAX}: \n");
          int one = sc.nextInt();
		  int two = sc.nextInt();
		  int three=sc.nextInt();
		  
		System.out.print("Enter 2 FLOAT ELEMENT TO FIND {MAX}: \n");
          float first1 = sc.nextFloat();
		  float second1 = sc.nextFloat();
		 

       

        
		int result1 =findMax(first,second);
		int result2 =findMax(one,two,three);
		float result3 =findMax(first1,second1);
		System.out.println("THE MAX OF 2 INTEGER ELEMENT IS  "+result1);
		System.out.println("THE MAX OF 3 INTEGER ELEMENT IS "+result2);
		System.out.println("THE MAX OF 2 FLOAT ELEMENT IS "+result3);


	}
}