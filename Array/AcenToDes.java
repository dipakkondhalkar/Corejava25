//Q5. Write a java program to sort given array is ascending & descending order.



import java.util.*;
public class AcenToDes{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.printf("Enter SIZE of ARRAY\n");
int no = sc.nextInt();
int []a= new int[no];
System.out.print("Enter the elements\n");
for(int i=0;i<no;i++){
    a[i] = sc.nextInt();
}

//ascending order.
 for(int i=0;i<no-1;i++){
	
	for(int j=0; j<no-1-i;j++){
		
	if(a[j] > a[j+1]){
		
		int temp = a[j];
	   a[j] = a[j+1];
	   a[j+1] = temp;
	}
	}
 }
 System.out.print("Ascending order\n" );
	for(int i=0;i<no;i++){
	System.out.print(a[i]+ " ");

}


//Descending order is.
for(int i=0 ;i<no-1;i++){
	for(int j=0; j<no-1-i;j++){
	if(a[j] < a[j+1]){   //we make Descending order here.
		
		int temp = a[j];
		a[j] =a[j+1];
		a[j+1] =temp;
	}
	}
    }
 System.out.println("\nAray descending order");
 for(int i=0;i<no;i++){
	 System.out.print(a[i] + " ");
 }

}
}
/*
output:

Enter SIZE of ARRAY
5
Enter the elements
2
3
2
4
6
Ascending order
2 2 3 4 6
Aray descending order
6 4 3 2 2


*/