/*Q.4
Write a program to push 5 elements into a Stack and then pop them one by one (LIFO order).
__________________________________________________________*/

import java.util.*;
public class StackOperation
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 Stack<Integer> st = new Stack<>();
	 System.out.println("Enter How many elements want to enter :");
	 int n = sc.nextInt();
	 
	 System.out.println("Insert Elements in array : ");
	 for(int i=0;i<n;i++)
	 {
	    st.add(sc.nextInt());
	 }
	 
	 System.out.println("Element Pop :");
	 
	 while(!st.isEmpty())
	 {
         System.out.println(st.pop());
		 
	   }
	   //System.out.println(st);
	 }
  }
 /* output:Enter How many elements want to enter :
5
Insert Elements in array :
1
2
3
4
5
Element Pop :
5
4
3
2
1 */
