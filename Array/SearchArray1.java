import java.util.*;

public class SearchArray1
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter elements in array");
	  
	  int []a  = new int[5];
	  
	  for(int i=0;i<a.length;i++)
	  {
	    a[i] = sc.nextInt();
	  
	  }
      
	  System.out.println("Enter the search key");
	  int skey = sc.nextInt();
	  
	  boolean flag = false;
	  int index = -1;
	  for(int i=0;i<a.length;i++)
	  {
	      if(a[i] == skey)
		  {
			  System.out.println("Data found : " + skey);
		      flag = true ;
			  break;
			 
	
              }
	  }
	  if(!flag)
	  {
		  
		  System.out.println("Data not found");
		  
	  }
		  
   }
}
   

/*Enter the value of array
1
2
3
4
5
Enter the search key
5
Data found 4    */