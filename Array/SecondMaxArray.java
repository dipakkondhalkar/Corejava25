//Finding Second max value.

import java.util.*;
public class SecondMaxArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the elements in array");
int []a = new int[5];

for(int i=0;i<a.length;i++){

  a[i] = sc.nextInt();
  
}
int max = a[0] , smax = 0;
for(int i=0;i<a.length;i++){
  
   
   if(a[i]>max){
   
	  smax = max;
	  max = a[i];
   
   }
   else if(a[i]>smax && a[i]!=max){
   
   smax = a[i];
   }
   }
   System.out.println("SECOND MAX is " +smax);   
   
  int min =Integer.MAX_VALUE,smin =Integer.MAX_VALUE;
  for(int i=0;i<a.length;i++){
	  
	  if(a[i]<min){
		 
		  min = a[i];
		  
	  }
	  else if(a[i]<smin && a[i]!=min ){
		  
		  smin = a[i];
	  }
  }
		System.out.println("Second Min is " + smin);  
	  }
	  
  }