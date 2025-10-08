//utility

class A
{
  private A()
  {
   System.out.println("i am A constructor" );
  }
  static void showmethod()
  {
     System.out.println("I am a method");
  }
  static void  getmethod()
  {
    System.out.println("I am getmethod");
  }
}
public class PAPPU
{
 public static void main(String[]args)
 {
    A.showmethod();
	A.getmethod();
 }
}