//Q3. Copy all elements from one array to another.
//Explanation: Use a loop to copy each element from array1 to array2.

import java.util.*;
public class CopyArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int []a = new int[5];
int []b = new int[5];

System.out.println("Enter the number in arry");

for(int i=0;i<a.length;i++){
	
	a[i] = sc.nextInt();
}
for(int i=0;i<b.length;i++){
	
	b[i] = a[i];
	
}
System.out.println("Copied Array");

for(int i=0;i<b.length;i++){
	
	
	System.out.println(b[i] + "  ");
}
}
}








