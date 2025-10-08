//Q8. Write a java program to display only non-zero values from array.


import java.util.*;

public class NonZeroArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int []a = new int[5];
System.out.println(" Enter the values of array");
for(int i=0 ;i<a.length;i++){
    a[i] = sc.nextInt();
}
System.out.println(" Array with nonzero values are");
for(int i=0;i<a.length;i++){

   if(a[i]!= 0){
   
   System.out.print( a[i] + " " );
    }
   }
 }
}
/* output:
 Enter the values of array
1
2
3
4
0
 Array with nonzero values are
1 2 3 4             */