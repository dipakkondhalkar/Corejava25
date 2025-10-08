class A
{
   private A()
   { System.out.println("I am A constructor");
   }
   static void show(){
	     System.out.println("i am show function");
   }
   static void display()
   { System.out.println("I am display function");
   }
}
public class ABCAPP
{ 
   public static void main(String x[])
   {
             A.show();
	   A.display();
	   
   }
}
