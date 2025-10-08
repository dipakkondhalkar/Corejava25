/*5.Find Duplicates in an Array
oWrite a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.*/
 
import java.util.*;
class Array
{
   int x[];
   
   void getData(int a[])
   {
      x = a;
   }
   
   void showData()
   {
      for(int i=0 ;i<x.length;i++)
	  {
	      boolean flag  = false;
		  
		  for(int j=0 ;j<i;j++)
		  {
		  if(x[i]!=x[j])
		  {
		      flag  = true;
		  }
	  
	  }
    System.out.println(a[i] +" ");
   }

}

public class DupliArray
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(String[]args);
	 int []a = new int[5];
	 System.out.println("Ennter the elements in array ");
	 
	 for(int i=0;i<a.length;i++)
	 {
	     a[i] = sc.nextInt();
		 
	 }
	 
	 Array s1 = new Array();
	 s1.getData(a);
	 s1.showData();
  
  }


}











