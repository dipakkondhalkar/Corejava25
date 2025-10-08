class A
{  A()
  {
	//  System.out.println("I am A Constructor");
  }
}
class B extends A
{   B()
  {
	  super();
	  System.out.println("I am B Constructor");
  }
}
public class CIAPP
{  public static void main(String x[])
   {    B b1 = new B();
		
   }
}
