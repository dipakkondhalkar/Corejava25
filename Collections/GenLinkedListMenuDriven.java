/*Q.3
Create a menu-driven program using LinkedList where user can:
Add element
Remove element
Search element
Display all elements*/

import java.util.*;
public class GenLinkedListMenuDriven
{
	public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 LinkedList<Integer> list = new LinkedList<>();
	
	 do{
	 
	   System.out.println("1.ADD Element.  \n 2. Remove Element.  \n 3.Search Element .  \n 4.display Element.  \n 5.Exit ." );
	   
	   System.out.println("Enter Choice :");
	   int choice  = sc.nextInt();
	   
	   switch(choice)
	   {
		    case 1 :
			 System.out.println("Enter Number To enter Elemenets : ");
			 int n = sc.nextInt();
			 
             System.out.println("Add Elements : ");
			 for(int i=0;i<n;i++)
			 {
             list.add(sc.nextInt());
			 }
              break;
			  
            case 2 :
       
             System.out.println("Enter Elements to Remove  : ");
             Integer r = sc.nextInt();
              if(list.remove(r))			
			  {
				  System.out.println("Element romove Successfully.........");
			  }
			  else
			  {
				  System.out.println("Elements not get found ..");
				    
			  }
			  break;
			  
			  case 3 :
			  System.out.println("Enter Element to search :");
			  Integer search = sc.nextInt();
			  
			  if(list.contains(search))
			  {
				  System.out.println("Element Get Found.....");
			  }
			  else
			  {
				  System.out.println("Element not get found....");
				  
			  }
			  break;
			  
			  case 4 :
			  
			  System.out.println("Display All Elements  : " + list);
			  
			 break;
			 
			  case 5:
			  
			  System.out.println("OPERATION GET EXIT ");
			  break;
			  
			  default:
			  
			  System.out.println("Invalid Input________________");
                System.exit(0);
				
		  }
	 }
	 while(true);
   
  }
}