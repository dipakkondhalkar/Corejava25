import java.util.*;
public class SortArry
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number of Elements :");
	int n = sc.nextInt();
	int[]a = new int[n];
	System.out.println("Enter Elements" );
	for(int i=0;i<n;i++)
	{
	   a[i] = sc.nextInt();
	}
	System.out.println("Enter Number to find" );
	int b = sc.nextInt();
	int f = -1;
	int l = -1;
	for(int i=0;i<n;i++)
	{
	   if(f==-1 && a[i] == b)
	   {
	      f=i;
	   }
	   if(l == -1 && a[i]==b)
	   {
	      l = i;
		 
	   }
	}
	System.out.println(f);
	System.out.println(l);
  
  }
}