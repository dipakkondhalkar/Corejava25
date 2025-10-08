//Q10. Problem: Store integers in a Vector. Remove all odd numbers and print only even numbers.
import java.util.*;

public class VectorApppp10
{
public static void main(String []args)
{

   Vector<Integer>  v = new Vector<>(); //make Vector TO add Elements.
   
   v.add(1);
   v.add(30);
   v.add(45);
   v.add(23);
   v.add(34);
   v.add(67);
   v.add(98);
   v.add(19);
   v.add(31);
   v.add(42);
   v.add(45);
   v.add(23);
   v.add(34);
   v.add(67);
   v.add(98);
   v.add(19);
   
   
   for(int i=0;i<v.size();i++)    
   {
   
     if(v.get(i)%2!= 0)      //Check condition is true or not.
	 {
	   v.remove(i);        //remove ...
	   i--;
	 
	 }
   }
   System.out.println("Even Number : " + v);  //prints only even number.
}
}
/*
output:
Even Number : [30, 34, 98, 42, 34, 98] */
