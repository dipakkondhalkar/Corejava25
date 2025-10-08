/*Diagonal Elements Sum (Primary and Secondary)
Find the sum of the diagonals in a square matrix[3][3].*/

import java.util.*;
public class DiagonalArray{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the elements in array");
int a[][] = new int[3][3];

for(int i=0 ;i<a.length ;i++){
   for(int j=0 ;j<a.length;j++){
  a[i][j] = sc.nextInt();

}
}
int sum =0;

for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;i++){
	  
	  if(i==j){
	  
	  sum = sum + a[i][j];
	   
	   }
	  }
   System.out.printf("The left Diagonal is = %d\n "+ sum);
}
}

}