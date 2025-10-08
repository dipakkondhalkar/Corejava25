//Q2. Print elements that are greater than a given number x.
//Explanation: Use if (arr[i] > x) inside the loop.


import java.util.*;
public class AverageArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array");
int no = sc.nextInt();

int [] a = new int[no];

System.out.println("Enter the elements in array");
for(int i = 0 ;i<no; i++){
	
	a[i] = sc.nextInt();
	
}
System.out.println("Enter element  from we want greater");
int x = sc.nextInt();


 for(int i=0;i<no;i++){
	if(a[i]>x){
	
	System.out.printf(a[i] + " ");
   }
}
}
}
/*output:
Enter the size of array
5
Enter the elements in array
3
2
4
5
8
Enter element  from we want greater
3
4 5 8   *?