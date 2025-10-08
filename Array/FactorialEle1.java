/*Q1. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 
*/




import java.util.*;
public class FactorialEle1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the elements in array");
int []a = new int[5];
for(int i=0;i<a.length;i++){
	
	a[i] = sc.nextInt();
}
for(int i=0;i<a.length;i++){
	int count = 0;
for(int j=0 ; j<a.length;j++){

  if(a[i] == a[i]){
  
     count++;
  
  }
}
if(count == 1){
    System.out.printf("%d", a[i]);
}
}
}
}