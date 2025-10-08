//Q5. Replace each element with its factorial.
//Explanation: Use a loop to compute factorials for each element.

import java.util.*;
public class FactorialArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the elements in array");
int []a = new int[5];
for(int i=0;i<a.length;i++){
	
	a[i] = sc.nextInt();
}
int j=1,f=1 ;
  for(int i=0 ;i<a.length;i++){
	  
	  if(j<=a[i]){
		  f = f*j;
		  j++;
	  }
	  a[i]=f;
  }
  System.out.printf("Factorial of given elements is ");
  for( int i=0 ;i<a.length ;i++){

   System.out.printf("%d " ,a[i]);
}
}
}




