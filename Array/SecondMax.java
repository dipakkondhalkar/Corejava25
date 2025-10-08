import java.util.*;

public class SecondMax{
   public static void main(String x[]){
   Scanner xyz  = new Scanner(System.in);
	   int a[]=new int[5];
	   int max=-1,smax=-1;
	   System.out.println("Enter five values in array");
	   for(int i=0; i<a.length; i++)
	   {
	      a[i]=xyz.nextInt();
	   }
	   
	   for(int i=0;i<a.length;i++)
	   {  if(a[i]>max)
		  {   smax=max; 
 			  max=a[i];
		  }
		  else if(a[i]>smax && a[i]!=max)
		  { smax = a[i];
		  }
	   }
	   System.out.println("Second Max is "+ smax);
   }
}

