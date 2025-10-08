/* Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9  */

import java.util.*;	
public class RotatePositionArray{
	public static void main(String[]args){
	
Scanner sc = new Scanner(System.in);
System.out.printf("Enter SIZE of ARRAY\n");
int no = sc.nextInt();
int []a= new int[no];
System.out.print("Enter the elements\n");
for(int i=0;i<no;i++){
    a[i] = sc.nextInt();
}

System.out.println("Enter the position to rotate");
int position = sc.nextInt();


System.out.println("Array before Rotating");
System.out.println("Rotate");
for(int i=0 ;i<position;i++){
	
	
	System.out.println(a[i]);
    }
            for (int i = position; i < no ;i++) {
                System.out.println(a[i] + " ");
            }

System.out.println("Array after Rotating posititon");

for(int i=position;i<no;i++)
{
     System.out.print(a[i]+" ");
}
for(int i=0;i<position;i++)
{   
     System.out.print(a[i]+" ");
}	  
	
}
}
/*
Enter SIZE of ARRAY
8
Enter the elements
1
2
3
4
5
6
7
8
Enter the position to rotate
5
Array before Rotating
Rotate
1
2
3
4
5
6
7
8
Array after Rotating posititon
6
7
8
1
2
3
4
5   */