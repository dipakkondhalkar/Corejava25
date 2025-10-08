import java.util.*;

public class DeletePosition{
  public static void main(String[]args){
  
  Scanner sc = new Scanner(System.in); 
  int []a = new int[5];
  System.out.println("Enter the elements");
  
  for(int i=0;i<a.length;i++){
	  a[i] = sc.nextInt();
  }
  
  System.out.println("Enter the position to delete "); 
  int position = sc.nextInt();//position to delete.
  
  
  for(int i = position + 1 ; i<a.length; i++){
  
   a[i-1] = a [i];   // suppose position is 3+1 = 4 then a[i] is 4  and we shift to left it a[i-1] so 3 position there is;
  
   }
   System.out.println("Array after delete element");
   
   for(int i=0 ;i<a.length-1 ;i++){ // length become less by 1
   
   System.out.printf(a[i] + "");
   
   }
  
  }
}
/*output:
1
2
3
4
5
Enter the position to delete
3
Array after delete element
1235

*/