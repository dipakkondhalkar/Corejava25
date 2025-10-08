import java.util.*;
public class EvenOddSegregate
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the size of array");
int n = sc.nextInt();
int a[]=new int[n];

System.out.println("Enter the elements in Array");
 for(int i=0;i<n;i++){
  a[i] = sc.nextInt();
}

System.out.println("Numbers after the seggregate/seperate even after odd");
 for(int i=0;i<n;i++){  
   if(a[i]%2==0){
   	 System.out.printf(a[i]+ " ");
   }
}

 for(int j=0;j<n;j++){
   if(a[j]%2!=0){
      System.out.printf(a[j]+ " ");	    
	    }
	   }
	  }
	 }
/*	 output:
Enter the size of array
5
Enter the elements in Array
1
2
1
2
3
Numbers after the seggregate/seperate is
2 2 1 1 3

*/