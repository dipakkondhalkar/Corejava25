import java.util.*;
public class PDAPP1
{
  public static void main(String[]args)
  {
    
	 Vector v = new Vector();
	 
	 v.add(200);
	 v.add(300);
	 v.add(400);
	 v.add(600);
	 v.add(700);
	 
	 ListIterator li = v.listIterator(v.size());
	 
	 while(li.hasPrevious())
	 {
	 
	     Object obj  = li.previous();
		 System.out.println(obj +" ");
	 }
	 
	 
	 
  }
}