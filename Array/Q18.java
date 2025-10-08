/*Q18. Write a program in java to print all possible combinations of r elements in a given array.
Expected Output:
 The given array is:
 1 5 4 6 8 The combination from by the number of elements are: 4
 The combinations are:
 1 5 4 6
 1 5 4 8
 1 5 6 8
 1 4 6 8
 5 4 6 8
 */
 
 import java.util.*;
 public  class Q18
 {
	  void show(int a[],int n)
	 { 
		 for(int i=0;i<n-3;i++)
		 {
			 for(int j=i+1;j<n-2;j++)
			 {
				 for(int k=j+i;k<n-1;k++)
				 {
					 for(int m=k+i;m<n;m++)
					 {
						 System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[m]+" ");
					 }
				 }
			 }
		 }
		
	}
	 
	 public static void main(String args[])
	 {		Scanner sc=new Scanner(System.in);
		 	Q18 obj=new Q18();

			int a[]= new int[5];
			System.out.println("ENTER THE ARRAY ELEMENTS :");
			for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
		System.out.println("ENTER NUMBER :");
		int n=sc.nextInt();
	
		
		
		 obj.show(a,n);
		
		 
	 }
 }
 