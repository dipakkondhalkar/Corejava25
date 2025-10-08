/*Q.6
Check if Array is Sorted
Return true if the array is sorted in ascending order.  */

import java.util.*;

public class ArraySort{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n = sc.nextInt();

int []a = new int[n];

System.out.println("Enter the elements in array");
for(int i=0;i<n;i++){
 
  a[i] = sc.nextInt();

}
System.out.println("Array in decending order");
int temp;
for(int i=0;i<n;i++)
{   
   for(int j=i+1;j<n;j++)
   {
     if(a[i] > a[j])
	 
	 {
      temp = a[i];
	  a[i] = a[j];
	  a[j] = temp;
	  
	 
	 }
   
   }
   
	 
   }
   for(int i=0;i<n;i++)
   System.out.print(a[i]+ " ");
}
}
/*Enter the size of array
5
Enter the elements in array
1
2
1
3
4
Array in decending order
1 1 2 3 4    */