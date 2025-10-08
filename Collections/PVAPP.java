/*import java.util.*;

public class  PVAPP
{
  public static void main(String []args)
  {
     //Scanner sc = new Scanner(System.in);
	 Vector v = new Vector();
	 
	 System.out.println("Elements in Array ");

	 v.add(100);
	 v.add(200);
	 v.add(300);
	 v.add(400);
	 v.add(500);
	 v.add(600);
	 
	 int len = v.size();
	 System.out.println("Size of Vector is :" + len +"\n");
	 Iterator i = v.iterator();
	 
	
	 while(i.hasNext())
	 {
	    Object obj =i.next();
		
		System.out.println(obj);
	 }
	 boolean b = v.contains(300);
	 
	 if(b)
	 {
		 
		 System.out.println("Element found : "+ b);
	 }
	 else
	 {
		 System.out.println("Elements not found");
		 
	 }
	 boolean  c = v.isEmpty();
	 if(c)
	 {
		 System.out.println("Collection is Empty");
		 
	 }
	 else{
		 
		 System.out.println("Collection is not Empty");
	 }
	 
  }
}*/
/*
import java.util.*;
public class PVAPP
{
	public static void main(String []args)
    {  
	    Scanner xyz = new Scanner(System.in);
		//ArrayList al = new ArrayList();
		Vector v = new Vector(4,2);
		
		System.out.println("Capacity of Vector is :" + v.capacity());
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
	
	    System.out.println("Size of Vector is : " + v.size());
		System.out.println("Capacity of Array is : "+ v.capacity());
		
		boolean  b =v.isEmpty();
		if(b)
		{
			System.out.println("Collection is Empty");
		}
		else{
			
			System.out.println("Collection is Not Empty");
		}
	  Iterator i = v.iterator();
	  while(i.hasNext())
	  {
		  Object obj = i.next();
		  
		  System.out.println(obj);
		  
	  }	
	  System.out.println("Enter Element to Delete :");
	  int data = xyz.nextInt();
	  int index = v.indexOf(data);
	  if(index != -1)
	  {
		  System.out.println("Data found");
		  v.remove(index);
	  }
	  else{
		  
		  System.out.println("Data not found");
	  }
	  System.out.println("Elements After Remove Data:");
	  Iterator il = v.iterator();
	  while(il.hasNext())
	  {
		  Object obj1 = il.next();
		  
		  System.out.println(obj1);
		  
	  }	
	  
	  System.out.println("Total Size of Data After Removal of Element : " + v.size());
	  
	}	
}

*/