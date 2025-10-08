/*Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0
*/

import java.util.*;
public class MoveZeroes{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int no = sc .nextInt();

int []a = new int[no];
System.out.println("Enter the elements in array");
for(int i=0;i<a.length;i++)
{

     a[i]= sc.nextInt();
 }
 
 int left = 0, right = no - 1;
        while (left < right) {
            if (a[left] == 0) {
                // swap a[left] and a[right], then move right inward
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                right--;             // one zero placed at the end
            } else {
                left++;              // non‑zero already in good spot
            }
        }

       for (int i = 0; i < a.length; i++) {
    System.out.print(a[i] + " ");
    }

    }
}
/*
output:
Enter the size of array
10
Enter the elements in array
2 5 7 0 4 0 7 -5 8 0
2 5 7 8 4 -5 7 0 0 0    */
