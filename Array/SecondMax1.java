import java.util.*;
public class SecondMax1 
{ 
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the elements in array");
	  int []a = new int[5];
	  
	  for(int i=0;i<a.length;i++)
	  {
	    a[i] =sc.nextInt();
	  }

      int largest = -1, secondLargest = -1;

       for(int i=0;i<a.length;i++)
          {
		  
		     if(a[i]>largest)
			 {
			     largest = a[i];
			 
			 }
		  
		   }
       for(int i=0;i<a.length;i++)
          {
		     if(a[i]>secondLargest && a[i] != largest)
			 {
			    secondLargest = a[i];
			 
			 }
		   
		  }

          if(secondLargest == -1)
                   {
				      System.out.println("No max elements found");
				   
				   }		  
            else
			{
			  System.out.println("Array second largest element is----> "+ secondLargest);
			
			}
           		  
   
   }
}
/*
output:
Enter the elements in array
12
14
15
12
56
Array second largest element is----> 15 */








