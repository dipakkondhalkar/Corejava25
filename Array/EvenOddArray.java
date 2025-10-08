import java.util.*;

public class EvenOddArray{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);
int []a = new int[5];
System.out.println("Enter the elements in array");

for(int i=0 ;i<a.length; i++){
	
	a[i] =sc.nextInt();
	
}
int even = 0 , odd = 0;
for(int i=0 ;i<a.length; i++){
	
	
	if(a[i] % 2 ==0){
		
		even= even + a[i];	
		
	}
	else{
		
		odd = odd +a[i];

	}
}
System.out.println("Sum of even numbers----> " + even);
System.out.println("Sum of odd numbers-----> " + odd);
}
}
/*output:-

Enter the elements in array
1
2
3
4
5
Sum of even numbers----> 6
Sum of odd numbers-----> 9   */



