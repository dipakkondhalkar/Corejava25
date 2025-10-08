//Simple inheritance program.

class Value
{
   int x,y;
   void setvalue(int x,int y)
   {
     this.x = x;
	 this.y = y;
   }
}
class Add extends Value
{
  int getadd()
  {
     return x+y;
  }
}
class Mul extends Value
{
   int getMul()
   {
      return x*y;
   }
}

public class Calculate
{
  public static void main(String []args)
  {
      Add m1 = new Add();
	  m1.setvalue(10,20);
	 int result = m1.getadd();
	  System.out.println("Addition is : " + result);
	  
	  Mul m2 = new Mul();
	  m2.setvalue(10,10);
	  result = m2.getMul();
	  System.out.println("Multiplication is : " + result);
   
  }
}
/*
output:
Addition is : 30
Multiplication is : 100 */













