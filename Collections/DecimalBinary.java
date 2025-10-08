/*Q.7
Implement a program to convert decimal to binary using Stack. (Example: Input → 10, Output → 1010).
_________________________________________________________*/

import java.util.*;
public class DecimalBinary
{
 public static void main(String[]args)
 {
    Stack<Integer> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	int n = sc.nextInt();
	
	while(n>0)
	{
		stack.push(n%2);
		n = n/2;
	}
	System.out.println("Decimal to Binary number :" );
	
	while(!stack.isEmpty())
	{
	  System.out.println(stack.pop());
	}
 }
}
/*
output:
Enter Number :
10
Decimal to Binary number :
1
0
1
0*/