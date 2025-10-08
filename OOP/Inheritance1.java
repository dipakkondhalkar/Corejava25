
class ABC
{
  int x,y;
  void setvalue(int x, int y)
  {
     this.x = x;
	 this.y = y;
  }
}
class Add  extends ABC
{
   int getadd()
   {
      return x+y;
   }
}
class Mull  extends ABC
{
   int getMull()
   {
      return x*y;
   }
}
class Sub extends ABC
{
   int getsub()
   {
      return x-y;
   }
}
public class Inheritance1
{
  public static void main(String[]args)
  {
    Add a1 = new Add();
	a1.setvalue(10,20);
	int result = a1.getadd();
	System.out.println("Addition is : " + result);
	
	Mull m1 = new Mull();
	m1.setvalue(20,10);
    result = m1.getMull();
	System.out.println("Multiplication is :"+  result);
	
	Sub s1 = new Sub();
	s1.setvalue(100,60);
	result = s1.getsub();
	System.out.println("Substraction is : "+ result);
  }
}

