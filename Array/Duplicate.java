//Remove duplicates values in array.


import java.util.*;
public class Duplicate{
public static void main(String[]ags){
Scanner sc = new Scanner(System.in);

int []a = new int[5];

System.out.println("Enter elements in array");

for(int i=0;i<a.length;i++){

   a[i] = sc.nextInt();
}
System.out.println("Array after removing depulicates");

 for(int i=0;i<a.length;i++){

      boolean flag = false;
	  
	  for(int j=0;j<i;j++){

		 if(a[i]==a[j]){
			 
			 flag = true;
			 break;
		 }
	  }
		if(!flag){
			
			System.out.print(a[i]+ " ");
			
		} 
		
	  }
   }
}
/*output:
Enter elements in array
1
2
2
1
3
After removing depulicates
1
2
3
*/