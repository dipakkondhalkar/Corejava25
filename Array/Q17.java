/*Q17. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 
  2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7
 */
 import java.util.*;
 public  class Q17
 {
	 int max=1;
	 int count =1;
	
	  void show(int a[])
	 { int element=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			
			 
			    if(a[i]==a[i-1])
				{
					count ++;
					
				
					
				}else
				{
					count =1;
				}
				
				if(count >max)
				{
					max=count;
					element =a[i];
				}
				
		}
		System.out.println("THE MAX REPEATED ELEMENT FROM ARRAY IS:"+element);
		System.out.println("ELEMENT REPEATED FOR :"+max);

	}
	 
	 public static void main(String args[])
	 {		Scanner sc=new Scanner(System.in);
		 	Q17 obj=new Q17();

			int a[]= new int[10];
			System.out.println("ENTER THE ARRAY ELEMENTS :");
			for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
		
		 Arrays.sort(a);
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
	
		obj. show(a);
		 
	 }
 }
 