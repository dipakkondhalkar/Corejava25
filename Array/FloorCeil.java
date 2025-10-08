/*Q12. Write a program in java to find the Floor and Ceil of the number 0 to 10 from a sroted array.
Expected Output :
 The given array is : 1 3 5 7 8 9
 Number: 0 ceiling is: 1 floor is: -1
 Number: 1 ceiling is: 1 floor is: 1
 Number: 2 ceiling is: 3 floor is: 1
 Number: 3 ceiling is: 3 floor is: 3
 Number: 4 ceiling is: 5 floor is: 3
 Number: 5 ceiling is: 5 floor is: 5
 Number: 6 ceiling is: 7 floor is: 5
 Number: 7 ceiling is: 7 floor is: 7
 Number: 8 ceiling is: 8 floor is: 8
 Number: 9 ceiling is: 9 floor is: 9
 Number: 10 ceiling is: -1 floor is: 9 */

import java.util.*;
public class FloorCeil
{
   public static void main(String[]args)
   {  Scanner sc = new Scanner(System.in);
      
     int []a = new int[6];
	 System.out.println("Enter the elements");
	 for(int i=0;i<a.length;i++){
		 
		  a[i] = sc.nextInt();
		 
	 }
	 // System.out.println("Enter the number to floor and ceil");
	 // int x = sc.nextInt();
	 
	 for(int x=0 ;x<=10;x++){
	   int ceiling = -1;
	 int floor = -1;
	 
	 for(int i=0;i<a.length;i++)
	 {
	    
	   if(a[i]>=x)
	   {
	    ceiling = a[i];
		break;
	   }
	   }
	   
	    for(int i =0 ;i<a.length;i++){
	   if(a[i]<=x)
	   {
	     floor = a[i];
		
	   }
	 }
	 System.out.println("Number is : " + x + " ceiling is :" + ceiling + " floor is : " + floor );
   
   }

}
} /*
output:
Enter the elements
1 3 5 7 8 9
Number is : 0 ceiling is :1 floor is : -1
Number is : 1 ceiling is :1 floor is : 1
Number is : 2 ceiling is :3 floor is : 1
Number is : 3 ceiling is :3 floor is : 3
Number is : 4 ceiling is :5 floor is : 3
Number is : 5 ceiling is :5 floor is : 5
Number is : 6 ceiling is :7 floor is : 5
Number is : 7 ceiling is :7 floor is : 7
Number is : 8 ceiling is :8 floor is : 8
Number is : 9 ceiling is :9 floor is : 9
Number is : 10 ceiling is :-1 floor is : 9 */