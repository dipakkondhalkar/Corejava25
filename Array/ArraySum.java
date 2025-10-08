import java.util.*;
public class ArraySum{
public static void main(String[]args){

int []a = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of values");

for(int i=0; i<a.length;i++){
	
	a[i] = sc.nextInt();
	
}
int sum = a[0];
for(int i=0;i<a.length;i++){

	sum = sum + a[i];
	
}
System.out.println("sum is "+sum);
}
}
// output:
// Enter the number of values
// 1
// 2
// 3
// 4
// 5
// sum is 16