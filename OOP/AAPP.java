class A
{ private static A a1;
  private A()
  { System.out.println("I am A");
  }
  public static A getInstance()
  {
     if(a1==null)
	 { a1 = new A();
   System.out.println("Hash code in A referen "+System.identityHashCode(a1));
	 }
	 return a1;
  }
}
public class AAPP
{
    public static void  main(String x[])
	{     A a1 = A.getInstance();
	  System.out.println("Hash code in a1 reference "+System.identityHashCode(a1));

	      A a2 = A.getInstance();
	 System.out.println("Hash code in a2 referen "+System.identityHashCode(a2));

	      A a3 = A.getInstance();
	  System.out.println("Hash code in a3 referen "+System.identityHashCode(a3));

	      A a4 = A.getInstance();
	  System.out.println("Hash code in a4 referen "+System.identityHashCode(a4));

	
	}
}
