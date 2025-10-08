import java.util.*;

class Employee
{
   private int id;
   private String name;
   private int sal;

    public void setid(int id)
    {
    this.id = id;	 
    }  
    public int getid()
    {
       return id;
    }    
    public void setname(String name)
	{
	   this.name =name;
	}
	public String getname()
	{
	   return name;
	}
	public void setsal(int sal)
	{
	   this.sal = sal;
	}
	public int getsal()
	{
	   return  sal;
	}
	
	
	
}
public class APP
{
  public static void main(String []args)
  {
      Vector v  = new Vector();
	  
	  Employee emp1  = new Employee();
	  emp1.setid(1);
	  emp1.setname("Manish");
	  emp1.setsal(2000);
	  
	  Employee emp2 = new Employee();
	  emp2.setid(2);
	  emp2.setname("Deep");
	  emp2.setsal(5000);
	  
	  Employee emp3 = new Employee();
	  emp3.setid(3);
	  emp3.setname("Manish");
	  emp3.setsal(6000);
	  
	  Employee emp4 = new Employee();
	  emp4.setid(4);
	  emp4.setname("Vijay");
	  emp4.setsal(10000);
	  
	  v.add(emp1);
	  v.add(emp2);
	  v.add(emp3);
	  v.add(emp4);
	  
	  Iterator i  = v.iterator();
	  
	  while(i.hasNext())
	  {
           Object obj = i.next();
           Employee emp = (Employee)obj;
   
          System.out.println(emp.getid() + "\t" + emp.getname() + "\t "+ emp.getsal());   
		
	  }	  
  }
}












