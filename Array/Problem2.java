/*
2. Problem:
Count all pairs in an array whose sum is equal to a given number.
Input: arr = [1, 5, 7, -1, 5], sum = 6
Output: 3 (pairs: (1,5), (7,-1), (1,5))
*/


import java.util.*;
public class Problem2{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of arry\n");
		int n = sc.nextInt();
		int []a = new int[n];
		
		System.out.println("Enter the elements of array\n");
		for(int i=0;i<n;i++){
			
			a[i] = sc.nextInt();
		   
		}
		System.out.println("Enter number which want to sum");
		int sum = sc.nextInt();
		
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				
				if(a[i] + a[j] == sum){
					
				System.out.print("("+a[i]+ "," + a[j]+") " );
					
					count++;
					
					
				}
			}
			
			}
			System.out.print("Total pairs are"+ count);
			
	}	
}
/*
output:
Enter the size of arry
5
Enter the elements of array

1
5
7
-1
5
Enter number which want to sum
6
(1,5) (1,5) (7,-1) Total pairs are3  */