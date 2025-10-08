import java.util.*;
public class SecondMin
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the values in array");
	 
	 int []a = new int[6];
	 
	 for(int i=0;i<a.length;i++)
	 {
	    a[i] = sc.nextInt();
	 
	 }
	 
	 int min = a[0],smin = a[0];
	 for(int i=0;i<a.length;i++)
	 {
	      if(a[i] < min)
		  {
		     min = a[i] ;
		  
		  }
	 }
	 // for(int i=0;i<a.length;i++)
	 // {
	   // if(a[i] < smin && a[i]!=min)
	    // {
		    // smin = a[i];
		// }
	 
	 // }
         System.out.println("Second min is " + min);
  }

}