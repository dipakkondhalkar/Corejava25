import java.util.*;

public class SortList
{
	public static void main(String[]args)
	{
		List list = new ArrayList();
		
		list.add(100);
		list.add(500);
		list.add(300);
		list.add(200);
		list.add(50);
		list.add(2);
		
		System.out.println("Before Sorting : ");
		for(Object obj : list)
		{
			System.out.println(obj);
		}
		Collections.sort(list);
		System.out.println("After Sorting : ");
		
		for(Object obj : list)
		{
			System.out.println(obj);
		}
		Object m1 = Collections.max(list);
		System.out.println("Max in List :" + m1);
		
		Object m2 = Collections.min(list);
		System.out.println(" Min in List  : "+  m2);

        Collections.reverse(list);
		System.out.println("\n");
		for(Object obj : list)
		{
        System.out.println(" Reverse List : " + obj);	
		}		
	}
	
}