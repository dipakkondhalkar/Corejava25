import java.util.*;
public class MissingElenment{
public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("Enter five values in array");
	  for(int i=0; i<a.length; i++)
	  {
	    a[i]=xyz.nextInt();
	  }
	  System.out.println("Missing elements ");
          int count = 0;
	  for(int i=a[0]; i<a[a.length-1]; i++)              
	  {    if(i!=a[count])
		   { System.out.printf("%d\t",i);
		   }
		   else{
			    ++count;
		   }		
	  }
   }
}

