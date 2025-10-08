/*class Square
{
   int no;
   
   void setvalue(int x)
   {
      no=x;
	  System.out.println("Number is :" + no);
   }
   void showSquare()
   {  
      System.out.printf("Square is %d\n" , no*no);
   }
}
public class SQAPP
{
   public static void main(String []args)
   {
	 Square s1 = new Square();
      s1.setvalue(10);
      s1.showSquare();	  
   
   }
}*/
/*
output:
Number is :10
Square is 100  */

// Method variable Argument

class Add
{  int s = 0;
   void calsum(int ...x)
   {
	   for(int i=0;i<x.length;i++)
	   {
		   s = s + x[i];
		   
	   }
	   System.out.println("Sum is " + s);
   }   
	
}
public class SQAPP
{
	public static void main(String[]args)
	{
		Add s1 = new Add();
		s1.calsum(10, 20 , 30 ,40 , 50);
	}
}










