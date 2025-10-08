 /*Q11. Write a program in java to find the ceiling in a sorted array?
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x.
 Expected Output :
 The given array is : 1 3 4 7 8 9 9 10
 The ceiling of 5 is: 7
 */
 public class Q11
 {
	 
	 static void celling(int a[],int n)
	 {
		 
		 int celling=0;
		for(int i=0;i<a.length;i++)
		 {
			 if(a[i]>n)
			 {
			  celling =a[i];
			  break;
			 }
		 }
return celling;		 
	 }
	 public static void main(String args[])
	 {
		 int a[]={1,3,4,7,8,9,9,10};
		 int n=5;
		int topvalue= celling(a[], n);
		System.out.println("THE CELLING VALUE FOR :"+n+" is : "+topvalue);
		 
		 
		 
	 }
	 
 }
