/*Q4. Vector & ArrayList - Merge Lists
Write a program to:
Store numbers in a Vector and an ArrayList.
Merge both into a single collection.
Remove duplicates.
Sort final list in descending order.*/

import java.util.*;

public class Merge
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	
	Vector<Integer> v = new Vector<>();
	
    System.out.println("Enter Number of Elements : ");
	int n = sc.nextInt();
	
	System.out.println("Add Elements in Vector : ");
	for(int i=0;i<n;i++)
	{
	   v.add(sc.nextInt());
	}
	
	ArrayList<Integer>  al = new ArrayList<>();
   
   System.out.println("Enter Number of Elements : ");
	int n1 = sc.nextInt();
	
	System.out.println("Add Elements in Arraylist : ");
	for(int i=0;i<n1;i++)
	{
	   al.add(sc.nextInt());
	}
	
	
	System.out.println("Merged --");
	ArrayList<Integer>  merged = new ArrayList<>();
	
	merged.addAll(v);
	merged.addAll(al);
	
	 ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : merged) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
		
	 Collections.sort(uniqueList, Collections.reverseOrder());
	 
        System.out.println("Merged, unique, and sorted (descending) list:");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }	
		
   }
   /*
output:
Enter Number of Elements :
5
Add Elements in Vector :
1
2
3
4
5
Enter Number of Elements :
3
Add Elements in Arraylist :
4
5
6
Merged --
Merged, unique, and sorted (descending) list:
6 5 4 3 2 1 */