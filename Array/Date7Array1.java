//Q3. Identify duplicate elements in the array.
//Explanation: Use nested loops to compare each element with every other.



import java.util.*;
public class Date7Array1{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int []a = new int[5];
		System.out.println("Enter the values ");
		
		for(int i=0; i<a.length;i++){
			
			a[i] = sc.nextInt();
			
		}
		 System.out.println("Duplicate element in array are ");
	 for(int i=0; i<a.length;i++){
		for(int j=i+1; j<a.length; j++){
			
			if(a[i] == a[j]){
				
			
				System.out.println(a[i]);
				break;
			}
		}
	 }
	}
}
/*Enter the values
5
4
4
6
5
Duplicate element in array are
5
4        */