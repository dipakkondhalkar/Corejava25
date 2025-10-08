//Q3. Find the largest element in a given array.
//Explanation: Initialize max as the first element and compare it with each array element.


import java.util.*;
public class Array1Day2{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
System.out.println("Enter the values in array");
for(int i= 0; i<a.length;i++)
{
    a[i]=sc.nextInt();
	
}
int max = a[0];
for(int i=0;i<a.length;i++)
{
 if(a[i]>max)
 {  max=a[i];
   }
 }
System.out.println("Max value is " + max); 
}
}

//output:
// Enter the values in array
// 10
// 20
// 30
// 40
// 50
// Max value is 50