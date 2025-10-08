//class program.

import java.util.*;	
class Employee
{
  private int id;
  private String name;
  private int sal;
  
  public void setId(int id)
  { this.id=id;
  }
  public int getId()
  { return id;
  }
  public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal()
   { return sal;
   }
}
public class ArrObjAPP
{ 
   public static void main(String x[])
   {
      Employee emp[] = new Employee[5];
	  for(int i=0; i<emp.length; i++)
	  {   emp[i]=new Employee();
 		  Scanner xyz = new Scanner(System.in);
		  System.out.println("Enter name id and salary");
		  String name=xyz.nextLine();
		  int id=xyz.nextInt();
		  int sal=xyz.nextInt();
		  emp[i].setName(name);
		  emp[i].setId(id);
		  emp[i].setSal(sal);
	  }
       System.out.println("Display Data");
	    for(int i=0; i<emp.length;i++)
	  {
		  System.out.println(emp[i].getName()+"\t"+emp[i].getId()+"\t"+emp[i].getSal());
	  }
   }
}

