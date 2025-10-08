import java.util.*;
public class ArrayBasic{
	public static void main(String[]args){
		int []a =new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++){
			
		  a[i] = sc.nextInt();
		}
		System.out.println("Display the values");
	 for(int i=0;i<a.length;i++){
		 
		 System.out.printf("%d\t",a[i]);
	 }
	
	
	}
	
	
}
// output:
// Enter the values
// 10
// 20
// 30
// 40
// 50
// Display the values
// 10      20      30      40      50