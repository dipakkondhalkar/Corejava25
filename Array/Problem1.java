/*1. Problem:
Move all 0’s to the end of the array without changing the order of non-zero elements.
Input: arr = [0, 1, 0, 3, 12]
Output: arr = [1, 3, 12, 0, 0]   */


public class Problem1{
public static void main(String[]args){

int []a = {0,1,0,3,12};

int nonzero = 0;
for(int i=0 ;i<a.length;i++){
    
	if(a[i] !=0){

	   int temp = a[i];
	   a[i] = a[nonzero];
	   a[nonzero] = temp;
	   nonzero++;
	}
 }
 for(int i=0;i<a.length;i++){
 System.out.print(a[i] + "  ");
 }
} 
 }
// output:
// 1  3  12  0  0