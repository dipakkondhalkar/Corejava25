import java.util.*;
public class 2DMaxElement
{  public static void main(String x[])
	{  int a[][]=new int[3][3];
	   Scanner xyz = new Scanner(System.in);
	   System.out.println("Enter values in matrix");
	   for(int i=0; i<a.length; i++)
	   {   for(int j=0; j<a[i].length; j++)
			{ a[i][j]=xyz.nextInt();
			}
	   }
	    
	   System.out.println("Display matrix");
	   for(int i=0,count=0; i<a.length; i++)
	   {    int max=a[i][count];
           for(int j=0; j<a[i].length; j++)
			{   
		       if(a[i][j]>max)
			   { max=a[i][j];
			   }
			}
			System.out.printf("Max value %d row is %d\n",(i+1),max);
			count=0;
	   }
	   
	}
}

