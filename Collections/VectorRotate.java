/*Q.6
Vector Rotation
Input: [1, 2, 3, 4, 5], rotate by 2
Output: [4, 5, 1, 2, 3].
*/

import java.util.*;

public class VectorRotate
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	
	 System.out.println("ENTER ELEMENTS :");
	 int n = sc.nextInt();
	 
	 System.out.println("Enter Number :");
	 Vector<Integer> v = new Vector<>();
	 for(int i=0;i<n;i++)
	 {
	 
	    v.add(sc.nextInt());
	 }
	 
	 System.out.println("Enter position to rotate :");
	 int rotate = sc.nextInt();
	 
	 for(int i=rotate+1;i<v.size();i++)
	 {
	    System.out.println(v.get(i));
	 }
	 
	 for(int i=0;i<=rotate;i++)
	 {
	   System.out.println(v.get(i));
	 }
	 
  }
}
/*
output:
ENTER ELEMENTS :
6
Enter Number :
11
22
33
44
55
66
Enter position to rotate :
3
55
66
11
22
33
44*/