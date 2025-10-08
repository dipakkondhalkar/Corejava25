//Q4. Print all pairs of elements whose sum equals a target number.
//Explanation: Use nested loops and check if arr[i] + arr[j] == sum.


import java.util.*;

public class TargetNumber{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array");
int no = sc.nextInt();

System.out.println("Enter the elements in array");
int []a = new int[no];
for(int i=0 ;i<no ; i++){
	
	a[i]= sc.nextInt();
	
}
int  sum =0;
for(int i=0; i<no;i++){

  for(int j=i+1; j<no ;j++){
  
    if(no!=0){
    sum = a[i] + a[j];

}
}
for( i=0 ;i<no ;i++){

   System.out.printf("%d " ,sum);
   }
   }
}
}