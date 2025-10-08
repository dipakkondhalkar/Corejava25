import java.util.*;

public class PAP
{
	public static void main(String []args)
	{
		
		LinkedList lst = new LinkedList();
		
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		lst.add(500);
		lst.add(600);
		
		Iterator i = lst.iterator();
		
		while(i.hasNext())
		{
			
			Object obj = i.next();
			
			System.out.println(obj);
		}
		
	}
	
}