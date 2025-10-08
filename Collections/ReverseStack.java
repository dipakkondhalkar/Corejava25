/*Q.6
Write a program to reverse array element using stack

for example:-[1,2,3,4,5]  output[5,4,3,2,1]
________________________________________________________________________________*/

import java.util.*;
public class ReverseStack
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter Number of Element :");
	 int n = sc.nextInt();
	 
	 Stack<Integer> stack = new Stack<>();
	 
	 System.out.println("Enter ELEMENTS IN ARRAY :");
	 
	 int []a = new int[n];
	 for(int i=0;i<n;i++)
	 {
	     a[i] = sc.nextInt();
		 stack.push(a[i]);
	 
	 }
	 System.out.println("Array After Reverse : ");
	 for(int i=0;i<n;i++)
	 {
		a[i] = stack.pop();
	 }
	
     for(int i=0;i<n;i++)
     {
		 
		 System.out.println(a[i]);
	 }		 
  }
}
/*
output:
Enter Number of Element :
5
Enter ELEMENTS IN ARRAY :
1
2
3
4
5
Array After Reverse :
5
4
3
2
1 */