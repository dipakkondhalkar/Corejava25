//Q4. Find the smallest element in a given array.
//Explanation: Same logic as above, but use min and update when a smaller value is found.



import java.util.*;
public class Array2Day2{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the values ");

int []a = new int[5];
for(int i=0; i<a.length; i++){
a[i] = sc.nextInt();
}
int min = a[0];
for(int i=1; i<a.length;i++){
 if(a[i]<min)
 {  min=a[i];
   }
 }
System.out.println("Max value is " + min); 
}
}
// Enter the values
// 10
// 20
// 30
// 40
// 50
// Max value is 10
