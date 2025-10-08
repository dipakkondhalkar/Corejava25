class A
{
   A(int x)
   {
     System.out.println("I am Parent Constructor " + x);
   }
}
class B extends A
{    
   B()
   {
    super(100);
	System.out.println("I am Child B");
   }
}

public class Parameter
{
  public static void main(String []args)
  {
       B m1 = new B();   
  }
}
/*
/*
/*
/*
/*
output:
I am Parent Constructor 100
I am Child B  */