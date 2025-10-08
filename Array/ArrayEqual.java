/*
Check if Two Arrays are Equal (same elements, any order)
Display message yes if both array elements are equal otherwise display No  */

import java.util.*;

public class ArrayEqual
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);

int []a = new int[5];
int []b = new int[5];

System.out.println("Enter the Elements of  A array");
for(int i=0;i<a.length;i++){
  a[i] = sc.nextInt();
}

System.out.println("Enter the Elements of B Array");
for(int i=0;i<a.length;i++){
   b[i] = sc.nextInt();
   
}
Arrays.sort(a);
Arrays.sort(b);

boolean flag = true;
for(int i=0;i<a.length;i++){
	   
	   if(a[i] != b[i]){		   
		   flag = false;
		   break;
	    }
	   }
	 if(flag){
		 
		 System.out.println("yes Elements are same");
	 }
	 else{
		 
		 System.out.println("no Elements are same");
	 }
	
   }
}
/*
output:
Enter the Elements of  A array
2
3
4
5
6
Enter the Elements of B Array
2
1
2
3
4
no */