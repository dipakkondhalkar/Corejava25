//Count the Occurrence of a Specific Element
//Input: element x, Output: number of times it appears in array


import java.util.*;
public class ElementOccur{
public static void main(String[]args)
{

Scanner sc = new Scanner(System.in);
System.out.println("---Enter the size of elements---");
int n = sc.nextInt();
int a[] =new int[n];

System.out.println("---Enter the elements in array---");

for(int i=0;i<a.length;i++){
 a[i] =sc.nextInt();

}
System.out.println("---Enter number to count occurance in array---");
int x= sc.nextInt();

System.out.println("----Occurance of element ----");
int count =0;
for(int i=0;i<a.length;i++){

   
   if(a[i] == x ){
   
   ++count;
   }
}
System.out.println(count);
}
}
/*
output:
---Enter the size of elements---
5
---Enter the elements in array---
1
1
2
3
4
---Enter number to count occurance in array---
1
----Occurance of element ----
2

*/