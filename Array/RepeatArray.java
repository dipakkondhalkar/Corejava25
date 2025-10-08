

/* Question:
 	Return the first element that repeats in the array.
Input:
arr = {10, 5, 3, 4, 3, 5, 6}
Explanation:
Use a boolean array or nested loops to track seen elements.
Expected Output:
First repeating element is 5   */


import java.util.*;
public class RepeatArray{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

int []a = new int[7];
System.out.println("Enter the values of array");
for(int i=0;i<a.length;i++){

a[i] = sc.nextInt();
}
System.out.println("The first repeating element is:");
for(int i=0 ;i<a.length;i++){
   for(int j=i+1 ;j<a.length;j++){
   
   if(a[i]== a[j]){
     
	 System.out.println(a[i]);
	 return;
	 }
	 
	 }
	 }
	 
   System.out.println("no reppeating element found");
   }
   
}
/*
output:
Enter the values of array
8
5
3
4
3
5
6
The first repeating element is:
5

*/