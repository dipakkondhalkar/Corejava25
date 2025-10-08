//Q3. Create a new array where each element is the square of the original.
//Explanation: newArr[i] = arr[i] * arr[i]; in loop.


import java.util.*;
public class SquareArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array");
int no = sc.nextInt();

int [] a = new int[no];

System.out.println("Enter the elements in array");
for(int i = 0 ;i<no; i++){
	
	a[i] = sc.nextInt();
	
	
}
//System.out.printf("Elements before square"+ a[i]);
System.out.println("Square of given array is");
for(int i=0;i<a.length;i++){
	if(no!=0){
	a[i] = a[i]* a[i];
	
	System.out.printf(a[i]+ " ");
}
}
}
}
/*
output:
Enter the size of array
5
Enter the elements in array
1
2
3
4
5
Square of given array is
1 4 9 16 25
*/