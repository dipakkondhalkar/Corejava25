/*Q.4
 Create a class Calculator with two integers a and b.
Requirements:
Method setValues() to assign numbers.
Methods: add(), subtract(), multiply(), and divide().
_________________________________ */

import java.util.*;
class calValues
{  
    int First;
	int Second;
	
	
	 void setValues(int x ,int y)
	 {
		 First  = x;
		 Second  = y;
	 }
	 
	 void getDisplay()
	 {
		 System.out.println("Addition is = " + (First+ Second));
		 System.out.println("Substaction is = " + (First- Second));
		 System.out.println("Multiplcation is = "+ (First*Second));
		 System.out.println("Divide = " + (First/Second));
	 }
}

public class Calculator
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		int x = sc.nextInt();
		
		System.out.println("Enter Second number");
		int y = sc.nextInt();
		
		calValues s1 = new calValues();
		s1.setValues(x,y);
		s1.getDisplay();
	}
	
}
/*
output:
Enter First number
12
Enter Second number
10
Addition is = 22
Substaction is = 2
Multiplcation is = 120
Divide = 1   */