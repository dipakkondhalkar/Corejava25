/*3. Problem:
Return union of two unsorted arrays (unique elements only).
Input: [1, 2, 3] and [2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]*/


	import java.util.*;
public class UNION
{
	public static void main(String x[])
	{
      Scanner sc  = new Scanner(System.in);
  
	 
	 int a[]={1,2,3};
	 int a2[]={2,3,4,5};
	  int c[]= new int[a.length+a2.length];
	  
	 //uninon logic
	 int index=0;
	 for(int i=0;i<a.length;i++)
	 {
		 c[index]=a[i];
		 index++;
	}
	
	for(int i=0;i<a2.length;i++)
	{   boolean flag =false;
		for(int j=0;j<a.length;j++)
		{
			if(a2[i]==a[j])
			{
				flag =true;
				break;
			}
		}
		if(!flag)
		{
			c[index]=a2[i];
			index++;
		}
	}
	
	for(int i=0;i<index;i++)
	{
		System.out.print(c[i]+" ");
	}
	
	
	
	//for INTERSECTION LOGIC
	System.out.println("INTERSECTION VALUE ARE :");
	int intersection[]=new int[a.length+a2.length];
	int intersectionindex=0;
	for(int i=0;i<a2.length;i++)
	{   boolean flag =false;
		for(int j=0;j<a.length;j++)
		{
			if(a2[i]==a[j])
			{
				flag =true;
				break;
			}
		}
		if(flag)
		{
			intersection[intersectionindex]=a2[i];
			intersectionindex++;
		}
	}
	
	for(int i=0;i<intersectionindex;i++)
	{
		System.out.print(intersection[i]+" ");
	}
	
	
}
}  
	  