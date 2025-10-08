/*.5
Create a menu-driven program using Stack where user can:
Push element
Pop element
Peek element
Display all elements
*/
import java.util.*;
public class MenuDrivenStack
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in); 
	 Stack<Integer>   stack = new Stack<>();
	 
	 do{
	 System.out.println("------SELECT CHOICE---------");
	 System.out.println("1.Push Element \n  2.Pop Elements  \n 3.peek Element  \n 4.Display Element   \n 5.Exit Operation....");
	 System.out.println("Enter Choice");
	 int choice = sc.nextInt();
		 switch(choice)
		 {
			 case 1 : 
			 System.out.println("Enter Number to Insert Value :");
			 int value = sc.nextInt();
			 System.out.println("PUSH VALUE :");
			 for(int i=0;i<value;i++)
			 {
				 stack.push(sc.nextInt());
			 }
			 break;
			 
			 case 2 :
			 if(stack.isEmpty())
			 {
				 System.out.println("------Stack is Empty-----");
			 } 
			 else
			 { 
				 System.out.println("Pop Element : "+ stack.pop());
				 System.out.println("Stack Now : "+ stack);
			 }
			 break;
			 
			 case 3 :
			 
			 if(!stack.isEmpty())
			 {
				 
				 System.out.println("Peek Element : " + stack.peek());
			 }
			 else
			 {
				 System.out.println("-----Stack is Empty-----");
			 }
			 break;
			 
			 case 4 :
			 
			 System.out.println("All Elements in Stack : "+ stack);
			 break;
			 
			 case 5 :
			 
			 System.out.println("Stack Exiting .....");
			 break;
			 
			 default :
			 
			 System.out.println("Invalid Input : ");
			 System.exit(0);
		 }
		 
	 }
	 while(true);
  }
}
/*output:
------SELECT CHOICE---------
1.Push Element
  2.Pop Elements
 3.peek Element
 4.Display Element
 5.Exit Operation....
Enter Choice
1
Enter Number to Insert Value :
5
PUSH VALUE :
1
2
3
4
5
------SELECT CHOICE---------
1.Push Element
  2.Pop Elements
 3.peek Element
 4.Display Element
 5.Exit Operation....
Enter Choice
2
Pop Element : 5
Stack Now : [1, 2, 3, 4]
------SELECT CHOICE---------
1.Push Element
  2.Pop Elements
 3.peek Element
 4.Display Element
 5.Exit Operation....
Enter Choice
3
Peek Element : 4
------SELECT CHOICE---------
1.Push Element
  2.Pop Elements
 3.peek Element
 4.Display Element
 5.Exit Operation....
Enter Choice
4
All Elements in Stack : [1, 2, 3, 4]
------SELECT CHOICE---------
1.Push Element
  2.Pop Elements
 3.peek Element
 4.Display Element
 5.Exit Operation....
Enter Choice
5
Stack Exiting .....
------SELECT CHOICE---------
1.Push Element
  2.Pop Elements
 3.peek Element
 4.Display Element
 5.Exit Operation....
Enter Choice
6
Invalid Input : */