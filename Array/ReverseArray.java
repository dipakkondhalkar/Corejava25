import java.util.*;
public class ReverseArray
{
  public static void main(String x[])
  {
     Scanner xyz  = new Scanner(System.in);
	 int a[]=new int[5];
	 System.out.println("enter values in array");
	 for(int i=0; i<a.length;i++)
	 {  a[i]=xyz.nextInt();
	 }
	 System.out.println("Before reverse value ");
	 for(int i=0; i<a.length; i++)
	 {
	     System.out.printf("a[%d] %d\n",i,a[i]);
	 }
	 int left=0,right=(a.length-1);
	 while(left<=right)
	 {
	    int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
		right--;
		left++;
	 }
	  System.out.println("After reverse");
	 for(int i=0; i<a.length; i++)
	 {
	     System.out.printf("a[%d] %d\n",i,a[i]);
	 }
  }
}


